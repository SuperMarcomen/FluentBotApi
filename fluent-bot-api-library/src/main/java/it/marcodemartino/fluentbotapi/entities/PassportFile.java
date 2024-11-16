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
public final class PassportFile {
  @SerializedName("file_id")
  String fileId;

  @SerializedName("file_unique_id")
  String fileUniqueId;

  @SerializedName("file_size")
  long fileSize;

  @SerializedName("file_date")
  long fileDate;
}
