package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class Sticker {
  String fileId;

  String fileUniqueId;

  String type;

  Integer width;

  Integer height;

  Boolean isAnimated;

  Boolean isVideo;

  PhotoSize thumbnail;

  String emoji;

  String setName;

  File premiumAnimation;

  MaskPosition maskPosition;

  String customEmojiId;

  Boolean needsRepainting;

  Integer fileSize;
}
