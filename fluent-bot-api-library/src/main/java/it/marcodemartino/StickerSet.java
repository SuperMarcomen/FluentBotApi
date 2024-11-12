package it.marcodemartino;

import java.util.List;

public record StickerSet(String name, String title, String stickerType, List<Sticker> stickers,
    PhotoSize thumbnail) {
}
