package it.marcodemartino.fluentbotapi;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InlineQueryResultsButton {
  @SerializedName("text")
  String text;

  @SerializedName("web_app")
  WebAppInfo webApp;

  @SerializedName("start_parameter")
  String startParameter;
}
