package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public abstract class InlineQueryResult {
  String type;

  String id;

  InlineKeyboardMarkup replyMarkup;
}
