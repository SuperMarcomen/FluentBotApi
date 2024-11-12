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
public abstract class InputMedia {
  String type;

  String media;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;
}
