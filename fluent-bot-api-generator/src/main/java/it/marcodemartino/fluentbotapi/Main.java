package it.marcodemartino.fluentbotapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import it.marcodemartino.fluentbotapi.entities.BotApi;
import it.marcodemartino.fluentbotapi.entities.Field;
import it.marcodemartino.fluentbotapi.entities.Type;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.lang.model.element.Modifier;

public class Main {

  public static void main(String[] args) throws URISyntaxException, IOException {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String json = Files.readString(Paths.get(Main.class.getResource("/api.json").toURI()));
    BotApi botApi = gson.fromJson(json, BotApi.class);

    List<String> strings = List.of("String", "Boolean", "Float");

    Map<String, Type> typesToCreate = botApi.types().values().stream()
        .filter(type -> type.fields() != null && type.fields().size() <= 1)
        .filter(type -> type.fields()
            .stream()
            .map(Field::types)
            .flatMap(List::stream)
            .anyMatch(strings::contains)
        ).collect(Collectors.toMap(Type::name, type -> type));

    botApi.types().values().stream()
        .filter(type -> type.subtypes() != null)
        .forEach(parent -> {
          parent.subtypes().forEach(subtype -> {
            System.out.println(typesToCreate.get(subtype).description());
          });
        });

    for (Type type : botApi.types().values()) {
      List<FieldSpec> list = new ArrayList<>();
      if (type.fields() == null) {
        continue;
      }
      if (type.fields().size() == 1) {
        System.out.println(type.fields().get(0).types().get(0));
      }

      for (Field field : type.fields()) {
        FieldSpec build = FieldSpec.builder(ClassName.get("it.marcodemartino", field.types().get(0)), field.name()).build();
        list.add(build);
      }

      TypeSpec newClass = TypeSpec.recordBuilder(type.name())
          .addFields(list
          )
          .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
          .build();

      JavaFile javaFile = JavaFile.builder("it.marcodemartino", newClass)
          .build();

      Path path = Paths.get("./fluent-bot-api-library/src/main/java/it/marcodemartino/" + type.name() + ".java");

      try {
        String string = javaFile.toString();
        Files.write(path, string.getBytes());
      } catch (java.lang.Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
}
