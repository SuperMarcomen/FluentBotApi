package it.marcodemartino;

import java.util.List;

public abstract class InputMedia {
  String type;

  String media;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;
}
