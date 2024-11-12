package it.marcodemartino;

public record InlineKeyboardButton(String text, String url, String callbackData, WebAppInfo webApp,
    LoginUrl loginUrl, String switchInlineQuery, String switchInlineQueryCurrentChat,
    SwitchInlineQueryChosenChat switchInlineQueryChosenChat, CopyTextButton copyText,
    CallbackGame callbackGame, Boolean pay) {
}
