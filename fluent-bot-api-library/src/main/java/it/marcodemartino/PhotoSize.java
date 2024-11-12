package it.marcodemartino;

public record PhotoSize(String fileId, String fileUniqueId, Integer width, Integer height,
    Integer fileSize) {
}
