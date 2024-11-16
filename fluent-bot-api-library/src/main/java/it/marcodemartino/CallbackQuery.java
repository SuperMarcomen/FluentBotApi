package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class CallbackQuery {
  String id;

  User from;

  MaybeInaccessibleMessage message;

  String inlineMessageId;

  String chatInstance;

  String data;

  String gameShortName;
}