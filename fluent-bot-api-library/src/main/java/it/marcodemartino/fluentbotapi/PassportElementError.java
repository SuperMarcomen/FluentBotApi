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
public final class PassportElementError {
  @SerializedName("source")
  String source;

  @SerializedName("type")
  String type;

  @SerializedName("message")
  String message;

  PassportElementErrorContent passportElementErrorContent;
}
