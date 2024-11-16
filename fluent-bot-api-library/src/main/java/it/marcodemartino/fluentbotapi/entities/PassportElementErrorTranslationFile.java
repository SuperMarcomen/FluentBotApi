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
public final class PassportElementErrorTranslationFile {
  @SerializedName("source")
  String source;

  @SerializedName("type")
  String type;

  @SerializedName("file_hash")
  String fileHash;

  @SerializedName("message")
  String message;
}
