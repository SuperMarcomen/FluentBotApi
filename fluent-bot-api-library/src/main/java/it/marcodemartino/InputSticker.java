package it.marcodemartino;

import java.util.List;

public record InputSticker(InputFile sticker, String format, List<String> emojiList,
    MaskPosition maskPosition, List<String> keywords) {
}
