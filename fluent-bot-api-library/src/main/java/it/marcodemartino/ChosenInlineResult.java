package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ChosenInlineResult {
  String resultId;

  User from;

  Location location;

  String inlineMessageId;

  String query;
}
