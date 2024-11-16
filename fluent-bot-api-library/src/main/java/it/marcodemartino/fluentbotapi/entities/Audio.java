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
public final class Audio {
  @SerializedName("file_id")
  String fileId;

  @SerializedName("file_unique_id")
  String fileUniqueId;

  @SerializedName("duration")
  long duration;

  @SerializedName("performer")
  String performer;

  @SerializedName("title")
  String title;

  @SerializedName("file_name")
  String fileName;

  @SerializedName("mime_type")
  String mimeType;

  @SerializedName("file_size")
  long fileSize;

  @SerializedName("thumbnail")
  PhotoSize thumbnail;
}
