package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class BackgroundTypePattern extends BackgroundType {
  String type;

  Document document;

  BackgroundFill fill;

  Integer intensity;

  Boolean isInverted;

  Boolean isMoving;
}
