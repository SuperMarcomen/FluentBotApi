package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InlineQueryResultVenue extends InlineQueryResult {
  String type;

  String id;

  Float latitude;

  Float longitude;

  String title;

  String address;

  String foursquareId;

  String foursquareType;

  String googlePlaceId;

  String googlePlaceType;

  InlineKeyboardMarkup replyMarkup;

  InputMessageContent inputMessageContent;

  String thumbnailUrl;

  Integer thumbnailWidth;

  Integer thumbnailHeight;
}
