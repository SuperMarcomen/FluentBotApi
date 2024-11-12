package it.marcodemartino;

public record KeyboardButton(String text, KeyboardButtonRequestUsers requestUsers,
    KeyboardButtonRequestChat requestChat, Boolean requestContact, Boolean requestLocation,
    KeyboardButtonPollType requestPoll, WebAppInfo webApp) {
}
