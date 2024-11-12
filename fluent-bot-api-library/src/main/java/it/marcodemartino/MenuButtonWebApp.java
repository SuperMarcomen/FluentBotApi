package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class MenuButtonWebApp extends MenuButton {
  String type;

  String text;

  WebAppInfo webApp;
}
