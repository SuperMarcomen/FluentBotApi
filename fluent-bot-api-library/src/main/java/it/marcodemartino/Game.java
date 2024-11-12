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
public final class Game {
  String title;

  String description;

  List<PhotoSize> photo;

  String text;

  List<MessageEntity> textEntities;

  Animation animation;
}
