package it.marcodemartino;

import java.util.List;

public final class InputMediaAnimation extends InputMedia {
  String type;

  String media;

  InputFile thumbnail;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  Boolean showCaptionAboveMedia;

  Integer width;

  Integer height;

  Integer duration;

  Boolean hasSpoiler;
}
