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
public final class PaidMediaPreview {
  @SerializedName("type")
  String type;

  @SerializedName("width")
  long width;

  @SerializedName("height")
  long height;

  @SerializedName("duration")
  long duration;
}
