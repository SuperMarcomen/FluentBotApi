package it.marcodemartino;

public record LoginUrl(String url, String forwardText, String botUsername,
    Boolean requestWriteAccess) {
}
