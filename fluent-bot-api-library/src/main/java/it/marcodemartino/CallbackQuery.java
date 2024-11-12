package it.marcodemartino;

public record CallbackQuery(String id, User from, MaybeInaccessibleMessage message,
    String inlineMessageId, String chatInstance, String data, String gameShortName) {
}
