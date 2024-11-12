package it.marcodemartino;

public record VideoNote(String fileId, String fileUniqueId, Integer length, Integer duration,
    PhotoSize thumbnail, Integer fileSize) {
}
