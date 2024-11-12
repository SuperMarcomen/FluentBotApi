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
import javax.lang.model.util.Types;

public class Generator {

  public static void main(String[] args) throws URISyntaxException, IOException {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String json = Files.readString(Paths.get(Generator.class.getResource("/api.json").toURI()));
    BotApi botApi = gson.fromJson(json, BotApi.class);
    new TypesGenerator(botApi);

    for (Type type : botApi.types().values()) {
      List<FieldSpec> list = new ArrayList<>();
      // Skip parent and child classes (Handled separately)
      if (type.subtypes() != null || type.subtypeOf() != null) {
        continue;
      }

      if (type.fields() != null) {
        for (Field field : type.fields()) {
          FieldSpec build = FieldSpec.builder(ParserUtils.parseType(field.types().get(0)),
              ParserUtils.snakeToCamelCase(field.name())).build();
          list.add(build);
        }
      }

      TypeSpec newClass = TypeSpec.recordBuilder(type.name())
          .addFields(list)
          .addModifiers(Modifier.PUBLIC)
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
