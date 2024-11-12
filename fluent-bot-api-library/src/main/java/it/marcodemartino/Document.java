package it.marcodemartino;

public record Document(String fileId, String fileUniqueId, PhotoSize thumbnail, String fileName,
    String mimeType, Integer fileSize) {
}
