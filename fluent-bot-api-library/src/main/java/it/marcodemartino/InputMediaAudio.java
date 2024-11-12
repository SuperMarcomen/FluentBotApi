package it.marcodemartino;

import java.util.List;

public final class InputMediaAudio extends InputMedia {
  String type;

  String media;

  InputFile thumbnail;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  Integer duration;

  String performer;

  String title;
}
