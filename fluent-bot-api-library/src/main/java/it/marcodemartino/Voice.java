package it.marcodemartino;

public record Voice(String fileId, String fileUniqueId, Integer duration, String mimeType,
    Integer fileSize) {
}
