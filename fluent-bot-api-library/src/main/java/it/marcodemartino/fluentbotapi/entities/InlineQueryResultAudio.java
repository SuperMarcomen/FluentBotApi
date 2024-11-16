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
public final class InlineQueryResultAudio {
  @SerializedName("type")
  String type;

  @SerializedName("id")
  String id;

  @SerializedName("audio_url")
  String audioUrl;

  @SerializedName("title")
  String title;

  @SerializedName("caption")
  String caption;

  @SerializedName("parse_mode")
  String parseMode;

  @SerializedName("caption_entities")
  List<MessageEntity> captionEntities;

  @SerializedName("performer")
  String performer;

  @SerializedName("audio_duration")
  long audioDuration;

  @SerializedName("reply_markup")
  InlineKeyboardMarkup replyMarkup;

  @SerializedName("input_message_content")
  InputMessageContent inputMessageContent;
}
