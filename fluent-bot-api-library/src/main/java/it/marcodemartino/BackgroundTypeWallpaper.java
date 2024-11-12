package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class BackgroundTypeWallpaper extends BackgroundType {
  String type;

  Document document;

  Integer darkThemeDimming;

  Boolean isBlurred;

  Boolean isMoving;
}
