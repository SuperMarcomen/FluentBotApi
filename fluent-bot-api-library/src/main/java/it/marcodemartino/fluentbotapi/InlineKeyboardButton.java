package it.marcodemartino.fluentbotapi;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InlineKeyboardButton {
  @SerializedName("text")
  String text;

  @SerializedName("url")
  String url;

  @SerializedName("callback_data")
  String callbackData;

  @SerializedName("web_app")
  WebAppInfo webApp;

  @SerializedName("login_url")
  LoginUrl loginUrl;

  @SerializedName("switch_inline_query")
  String switchInlineQuery;

  @SerializedName("switch_inline_query_current_chat")
  String switchInlineQueryCurrentChat;

  @SerializedName("switch_inline_query_chosen_chat")
  SwitchInlineQueryChosenChat switchInlineQueryChosenChat;

  @SerializedName("copy_text")
  CopyTextButton copyText;

  @SerializedName("callback_game")
  CallbackGame callbackGame;

  @SerializedName("pay")
  Boolean pay;
}
