package it.marcodemartino;

import java.util.List;

public final class InputMediaDocument extends InputMedia {
  String type;

  String media;

  InputFile thumbnail;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  Boolean disableContentTypeDetection;
}
