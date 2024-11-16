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
public final class InlineQueryResultVenue {
  @SerializedName("type")
  String type;

  @SerializedName("id")
  String id;

  @SerializedName("latitude")
  float latitude;

  @SerializedName("longitude")
  float longitude;

  @SerializedName("title")
  String title;

  @SerializedName("address")
  String address;

  @SerializedName("foursquare_id")
  String foursquareId;

  @SerializedName("foursquare_type")
  String foursquareType;

  @SerializedName("google_place_id")
  String googlePlaceId;

  @SerializedName("google_place_type")
  String googlePlaceType;

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
