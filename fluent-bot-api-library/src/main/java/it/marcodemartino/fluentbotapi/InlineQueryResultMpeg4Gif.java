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
public final class InlineQueryResultMpeg4Gif {
  @SerializedName("type")
  String type;

  @SerializedName("id")
  String id;

  @SerializedName("mpeg4_url")
  String mpeg4Url;

  @SerializedName("mpeg4_width")
  long mpeg4Width;

  @SerializedName("mpeg4_height")
  long mpeg4Height;

  @SerializedName("mpeg4_duration")
  long mpeg4Duration;

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
