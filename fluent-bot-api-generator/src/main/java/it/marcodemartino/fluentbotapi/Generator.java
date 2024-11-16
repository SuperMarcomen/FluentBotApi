package it.marcodemartino.fluentbotapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import it.marcodemartino.fluentbotapi.entities.BotApi;
import it.marcodemartino.fluentbotapi.generators.TelegramTypesGenerator;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Generator {

  public static void main(String[] args) throws URISyntaxException, IOException {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String json = Files.readString(Paths.get(Generator.class.getResource("/api.json").toURI()));
    BotApi botApi = gson.fromJson(json, BotApi.class);
    Path entitiesDir = Paths.get("./fluent-bot-api-library/src/main/java/it/marcodemartino/fluentbotapi/entities");
    if (!Files.exists(entitiesDir)) {
      Files.createDirectory(entitiesDir);
    }
    new TelegramTypesGenerator(botApi);
  }
}
