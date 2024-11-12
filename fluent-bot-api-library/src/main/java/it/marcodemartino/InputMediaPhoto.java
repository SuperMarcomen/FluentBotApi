package it.marcodemartino;

import java.util.List;

public final class InputMediaPhoto extends InputMedia {
  String type;

  String media;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  Boolean showCaptionAboveMedia;

  Boolean hasSpoiler;
}
