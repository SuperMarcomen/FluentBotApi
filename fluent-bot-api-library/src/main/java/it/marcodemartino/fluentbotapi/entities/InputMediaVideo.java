package it.marcodemartino.fluentbotapi.entities;

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
public final class InputMediaVideo {
  @SerializedName("type")
  String type;

  @SerializedName("media")
  String media;

  @SerializedName("thumbnail")
  InputFile thumbnail;

  @SerializedName("caption")
  String caption;

  @SerializedName("parse_mode")
  String parseMode;

  @SerializedName("caption_entities")
  List<MessageEntity> captionEntities;

  @SerializedName("show_caption_above_media")
  Boolean showCaptionAboveMedia;

  @SerializedName("width")
  long width;

  @SerializedName("height")
  long height;

  @SerializedName("duration")
  long duration;

  @SerializedName("supports_streaming")
  Boolean supportsStreaming;

  @SerializedName("has_spoiler")
  Boolean hasSpoiler;
}
