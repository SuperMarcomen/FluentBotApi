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
public final class InputPaidMediaVideo {
  @SerializedName("type")
  String type;

  @SerializedName("media")
  String media;

  @SerializedName("thumbnail")
  InputFile thumbnail;

  @SerializedName("width")
  long width;

  @SerializedName("height")
  long height;

  @SerializedName("duration")
  long duration;

  @SerializedName("supports_streaming")
  Boolean supportsStreaming;
}
