package it.marcodemartino.fluentbotapi.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class MenuButtonWebApp {
  @SerializedName("type")
  String type;

  @SerializedName("text")
  String text;

  @SerializedName("web_app")
  WebAppInfo webApp;
}
