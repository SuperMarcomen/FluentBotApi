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
public final class InlineQueryResultDocument {
  @SerializedName("type")
  String type;

  @SerializedName("id")
  String id;

  @SerializedName("title")
  String title;

  @SerializedName("caption")
  String caption;

  @SerializedName("parse_mode")
  String parseMode;

  @SerializedName("caption_entities")
  List<MessageEntity> captionEntities;

  @SerializedName("document_url")
  String documentUrl;

  @SerializedName("mime_type")
  String mimeType;

  @SerializedName("description")
  String description;

  @SerializedName("reply_markup")
  InlineKeyboardMarkup replyMarkup;

  @SerializedName("input_message_content")
  InputMessageContent inputMessageContent;

  @SerializedName("thumbnail_url")
  String thumbnailUrl;

  @SerializedName("thumbnail_width")
  long thumbnailWidth;

  @SerializedName("thumbnail_height")
  long thumbnailHeight;
}
