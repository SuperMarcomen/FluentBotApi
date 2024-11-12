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
public final class InputMediaDocument extends InputMedia {
  String type;

  String media;

  InputFile thumbnail;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  Boolean disableContentTypeDetection;
}
