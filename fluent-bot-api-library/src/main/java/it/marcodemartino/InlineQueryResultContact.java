package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InlineQueryResultContact extends InlineQueryResult {
  String type;

  String id;

  String phoneNumber;

  String firstName;

  String lastName;

  String vcard;

  InlineKeyboardMarkup replyMarkup;

  InputMessageContent inputMessageContent;

  String thumbnailUrl;

  Integer thumbnailWidth;

  Integer thumbnailHeight;
}
