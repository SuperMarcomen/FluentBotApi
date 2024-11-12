package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InlineQueryResultGame extends InlineQueryResult {
  String type;

  String id;

  String gameShortName;

  InlineKeyboardMarkup replyMarkup;
}
