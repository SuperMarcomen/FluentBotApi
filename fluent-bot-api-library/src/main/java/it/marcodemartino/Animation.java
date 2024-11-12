package it.marcodemartino;

public record Animation(String fileId, String fileUniqueId, Integer width, Integer height,
    Integer duration, PhotoSize thumbnail, String fileName, String mimeType, Integer fileSize) {
}
