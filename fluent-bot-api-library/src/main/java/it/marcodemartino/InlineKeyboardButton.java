package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InlineKeyboardButton {
  String text;

  String url;

  String callbackData;

  WebAppInfo webApp;

  LoginUrl loginUrl;

  String switchInlineQuery;

  String switchInlineQueryCurrentChat;

  SwitchInlineQueryChosenChat switchInlineQueryChosenChat;

  CopyTextButton copyText;

  CallbackGame callbackGame;

  Boolean pay;
}
