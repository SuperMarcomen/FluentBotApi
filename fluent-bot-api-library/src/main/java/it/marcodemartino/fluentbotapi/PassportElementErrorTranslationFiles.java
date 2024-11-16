package it.marcodemartino.fluentbotapi;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class PassportElementErrorTranslationFiles {
  @SerializedName("source")
  String source;

  @SerializedName("type")
  String type;

  @SerializedName("file_hashes")
  List<String> fileHashes;

  @SerializedName("message")
  String message;
}
