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
public final class PassportElementErrorUnspecified {
  @SerializedName("source")
  String source;

  @SerializedName("type")
  String type;

  @SerializedName("element_hash")
  String elementHash;

  @SerializedName("message")
  String message;
}
