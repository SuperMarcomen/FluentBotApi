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
public final class InlineQueryResultCachedPhoto {
  @SerializedName("type")
  String type;

  @SerializedName("id")
  String id;

  @SerializedName("photo_file_id")
  String photoFileId;

  @SerializedName("title")
  String title;

  @SerializedName("description")
  String description;

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
