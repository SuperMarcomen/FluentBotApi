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
public final class InlineQueryResultLocation {
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

  @SerializedName("horizontal_accuracy")
  float horizontalAccuracy;

  @SerializedName("live_period")
  long livePeriod;

  @SerializedName("heading")
  long heading;

  @SerializedName("proximity_alert_radius")
  long proximityAlertRadius;

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
