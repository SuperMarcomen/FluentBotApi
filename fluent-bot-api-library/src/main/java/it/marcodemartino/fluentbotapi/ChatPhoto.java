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
public final class ChatPhoto {
  @SerializedName("small_file_id")
  String smallFileId;

  @SerializedName("small_file_unique_id")
  String smallFileUniqueId;

  @SerializedName("big_file_id")
  String bigFileId;

  @SerializedName("big_file_unique_id")
  String bigFileUniqueId;
}
