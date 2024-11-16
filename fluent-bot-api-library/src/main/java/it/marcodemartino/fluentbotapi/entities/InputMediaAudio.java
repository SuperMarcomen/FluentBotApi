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
public final class InputMediaAudio {
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

  @SerializedName("duration")
  long duration;

  @SerializedName("performer")
  String performer;

  @SerializedName("title")
  String title;
}
