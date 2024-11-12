package it.marcodemartino;

public record Video(String fileId, String fileUniqueId, Integer width, Integer height,
    Integer duration, PhotoSize thumbnail, String fileName, String mimeType, Integer fileSize) {
}
