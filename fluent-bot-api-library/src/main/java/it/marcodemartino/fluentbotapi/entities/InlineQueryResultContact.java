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
public final class InlineQueryResultContact {
  @SerializedName("type")
  String type;

  @SerializedName("id")
  String id;

  @SerializedName("phone_number")
  String phoneNumber;

  @SerializedName("first_name")
  String firstName;

  @SerializedName("last_name")
  String lastName;

  @SerializedName("vcard")
  String vcard;

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
