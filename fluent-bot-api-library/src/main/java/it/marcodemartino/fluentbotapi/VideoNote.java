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
public final class VideoNote {
  @SerializedName("file_id")
  String fileId;

  @SerializedName("file_unique_id")
  String fileUniqueId;

  @SerializedName("length")
  long length;

  @SerializedName("duration")
  long duration;

  @SerializedName("thumbnail")
  PhotoSize thumbnail;

  @SerializedName("file_size")
  long fileSize;
}
