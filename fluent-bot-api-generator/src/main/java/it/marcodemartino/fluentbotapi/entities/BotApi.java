package it.marcodemartino.fluentbotapi.entities;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public record BotApi(
    String version,
    @SerializedName("release_date")
    String releaseDate,
    String changelog,

    Map<String, Method> methods,
    Map<String, Type> types
) {

}
