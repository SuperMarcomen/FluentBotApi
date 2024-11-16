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
public final class InlineQueryResultGif {
  @SerializedName("type")
  String type;

  @SerializedName("id")
  String id;

  @SerializedName("gif_url")
  String gifUrl;

  @SerializedName("gif_width")
  long gifWidth;

  @SerializedName("gif_height")
  long gifHeight;

  @SerializedName("gif_duration")
  long gifDuration;

  @SerializedName("thumbnail_url")
  String thumbnailUrl;

  @SerializedName("thumbnail_mime_type")
  String thumbnailMimeType;

  @SerializedName("title")
  String title;

  @SerializedName("caption")
  String caption;

  @SerializedName("parse_mode")
  String parseMode;

  @SerializedName("caption_entities")
  List<MessageEntity> captionEntities;

  @SerializedName("show_caption_above_media")
  Boolean showCaptionAboveMedia;

  @SerializedName("reply_markup")
  InlineKeyboardMarkup replyMarkup;

  @SerializedName("input_message_content")
  InputMessageContent inputMessageContent;
}
