package it.marcodemartino;

public record ChosenInlineResult(String resultId, User from, Location location,
    String inlineMessageId, String query) {
}
