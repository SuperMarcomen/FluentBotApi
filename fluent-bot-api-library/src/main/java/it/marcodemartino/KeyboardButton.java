package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class KeyboardButton {
  String text;

  KeyboardButtonRequestUsers requestUsers;

  KeyboardButtonRequestChat requestChat;

  Boolean requestContact;

  Boolean requestLocation;

  KeyboardButtonPollType requestPoll;

  WebAppInfo webApp;
}
