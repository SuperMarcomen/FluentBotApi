package it.marcodemartino.fluentbotapi;

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
public final class InlineQueryResultVideo {
  @SerializedName("type")
  String type;

  @SerializedName("id")
  String id;

  @SerializedName("video_url")
  String videoUrl;

  @SerializedName("mime_type")
  String mimeType;

  @SerializedName("thumbnail_url")
  String thumbnailUrl;

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

  @SerializedName("video_width")
  long videoWidth;

  @SerializedName("video_height")
  long videoHeight;

  @SerializedName("video_duration")
  long videoDuration;

  @SerializedName("description")
  String description;

  @SerializedName("reply_markup")
  InlineKeyboardMarkup replyMarkup;

  @SerializedName("input_message_content")
  InputMessageContent inputMessageContent;
}
