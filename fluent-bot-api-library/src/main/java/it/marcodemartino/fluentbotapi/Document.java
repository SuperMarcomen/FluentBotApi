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
public final class Document {
  @SerializedName("file_id")
  String fileId;

  @SerializedName("file_unique_id")
  String fileUniqueId;

  @SerializedName("thumbnail")
  PhotoSize thumbnail;

  @SerializedName("file_name")
  String fileName;

  @SerializedName("mime_type")
  String mimeType;

  @SerializedName("file_size")
  long fileSize;
}
