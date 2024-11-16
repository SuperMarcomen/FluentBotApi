package it.marcodemartino.fluentbotapi.generators;

import it.marcodemartino.fluentbotapi.entities.BotApi;
import it.marcodemartino.fluentbotapi.entities.Field;
import it.marcodemartino.fluentbotapi.entities.Type;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TelegramTypesGenerator {

  private static final String INTERFACE_SUFFIX = "Content";

  public TelegramTypesGenerator(BotApi botApi) {
    // Partition the types based on whether they are a parent
    Map<Boolean, List<Type>> parentMap = botApi.types().values().stream()
        .collect(Collectors.partitioningBy(type -> type.subtypes() != null));

    parentMap.get(true).forEach(parent -> {
      List<Type> children = botApi.types().values().stream()
          .filter(child -> child.subtypeOf() != null && child.subtypeOf().contains(parent.name()))
          .toList();

      List<Field> commonFieldsList = getCommonFields(children);

      for (Type child : children) {
        // Generate child implementing interface
        new JavaFileGenerator(child.name(), child.fields())
            .addSuperInterface(parent.name() + INTERFACE_SUFFIX)
            .save();
      }

      // Generate interface
      String interfaceName = parent.name() + INTERFACE_SUFFIX;
      new JavaFileGenerator(interfaceName)
          .save();

      // Generate parent
      // first letter lower case
      String interfaceVarName = Character.toLowerCase(interfaceName.charAt(0)) + interfaceName.substring(1);
      new JavaFileGenerator(parent.name(), commonFieldsList)
          .addField(interfaceName, interfaceVarName)
          .save();
    });

    parentMap.get(false).forEach(type -> {
      new JavaFileGenerator(type.name(), type.fields())
          .save();
    });
  }

  private List<Field> getCommonFields(List<Type> children) {
    Stream<Field> commonFields = children.get(0).fields()
        .stream();

    for (Type child : children) {
      commonFields = commonFields.filter(field -> child.fields().stream()
          .anyMatch(field::equals));
    }
    return commonFields.toList();
  }
}
