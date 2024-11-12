package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InlineQueryResultsButton {
  String text;

  WebAppInfo webApp;

  String startParameter;
}
