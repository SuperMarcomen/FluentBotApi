package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InlineQueryResultLocation extends InlineQueryResult {
  String type;

  String id;

  Float latitude;

  Float longitude;

  String title;

  Float horizontalAccuracy;

  Integer livePeriod;

  Integer heading;

  Integer proximityAlertRadius;

  InlineKeyboardMarkup replyMarkup;

  InputMessageContent inputMessageContent;

  String thumbnailUrl;

  Integer thumbnailWidth;

  Integer thumbnailHeight;
}
