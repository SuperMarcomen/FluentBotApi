package it.marcodemartino.fluentbotapi;

import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import it.marcodemartino.fluentbotapi.entities.BotApi;
import it.marcodemartino.fluentbotapi.entities.Field;
import it.marcodemartino.fluentbotapi.entities.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.lang.model.element.Modifier;

public class TypesGenerator {

  private final BotApi botApi;

  public TypesGenerator(BotApi botApi) {
    this.botApi = botApi;
    botApi.types().values().stream()
        .filter(type -> type.fields() == null)
        .forEach(parent -> {
          List<Type> children = botApi.types().values().stream()
              .filter(child -> child.subtypeOf() != null && child.subtypeOf().contains(parent.name()))
              .toList();

          if (children.isEmpty()) {
            return;
          }

          Stream<Field> commonFields = children.get(0).fields()
                  .stream();

          for (Type child : children) {
            commonFields = commonFields.filter(field -> child.fields().stream()
                .anyMatch(field::equals));
          }
          List<Field> commonFieldsList = commonFields.toList();

          for (Type child : children) {
            createChild(parent, child);
          }

          createParent(parent, commonFieldsList);
        });
  }

  private void createChild(Type parent, Type child) {
    List<FieldSpec> classAttributes = new ArrayList<>();

    for (Field field : child.fields()) {
      FieldSpec build = FieldSpec.builder(ParserUtils.parseType(field.types().get(0)),
          ParserUtils.snakeToCamelCase(field.name())).build();
      classAttributes.add(build);
    }

    TypeSpec newClass = TypeSpec.classBuilder(child.name())
        .addFields(classAttributes)
        .superclass(ParserUtils.parseType(parent.name()))
        .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
        .build();

    JavaFile javaFile = JavaFile.builder("it.marcodemartino", newClass)
        .build();

    saveJavaFile(child, javaFile);
  }

  private void createParent(Type parent, List<Field> commonFieldsList) {
    List<FieldSpec> classAttributes = new ArrayList<>();

    for (Field field : commonFieldsList) {
      FieldSpec build = FieldSpec.builder(ParserUtils.parseType(field.types().get(0)),
          ParserUtils.snakeToCamelCase(field.name())).build();
      classAttributes.add(build);
    }

    TypeSpec newClass = TypeSpec.classBuilder(parent.name())
        .addFields(classAttributes)
        .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
        .build();

    JavaFile javaFile = JavaFile.builder("it.marcodemartino", newClass)
        .build();

    saveJavaFile(parent, javaFile);
  }

  private void saveJavaFile(Type parent, JavaFile javaFile) {
    Path
        path = Paths.get("./fluent-bot-api-library/src/main/java/it/marcodemartino/" + parent.name() + ".java");

    try {
      String string = javaFile.toString();
      Files.write(path, string.getBytes());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
