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
public final class Video {
  @SerializedName("file_id")
  String fileId;

  @SerializedName("file_unique_id")
  String fileUniqueId;

  @SerializedName("width")
  long width;

  @SerializedName("height")
  long height;

  @SerializedName("duration")
  long duration;

  @SerializedName("thumbnail")
  PhotoSize thumbnail;

  @SerializedName("file_name")
  String fileName;

  @SerializedName("mime_type")
  String mimeType;

  @SerializedName("file_size")
  long fileSize;
}
