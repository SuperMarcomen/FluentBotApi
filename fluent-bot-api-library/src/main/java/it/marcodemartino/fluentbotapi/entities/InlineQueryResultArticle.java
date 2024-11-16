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
public final class InlineQueryResultArticle {
  @SerializedName("type")
  String type;

  @SerializedName("id")
  String id;

  @SerializedName("title")
  String title;

  @SerializedName("input_message_content")
  InputMessageContent inputMessageContent;

  @SerializedName("reply_markup")
  InlineKeyboardMarkup replyMarkup;

  @SerializedName("url")
  String url;

  @SerializedName("hide_url")
  Boolean hideUrl;

  @SerializedName("description")
  String description;

  @SerializedName("thumbnail_url")
  String thumbnailUrl;

  @SerializedName("thumbnail_width")
  long thumbnailWidth;

  @SerializedName("thumbnail_height")
  long thumbnailHeight;
}
