package it.marcodemartino;

public record Audio(String fileId, String fileUniqueId, Integer duration, String performer,
    String title, String fileName, String mimeType, Integer fileSize, PhotoSize thumbnail) {
}
