package it.marcodemartino;

public record Sticker(String fileId, String fileUniqueId, String type, Integer width,
    Integer height, Boolean isAnimated, Boolean isVideo, PhotoSize thumbnail, String emoji,
    String setName, File premiumAnimation, MaskPosition maskPosition, String customEmojiId,
    Boolean needsRepainting, Integer fileSize) {
}
