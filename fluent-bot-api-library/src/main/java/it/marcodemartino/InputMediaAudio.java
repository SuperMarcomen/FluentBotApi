package it.marcodemartino;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
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
