package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class BackgroundFillGradient extends BackgroundFill {
  String type;

  Integer topColor;

  Integer bottomColor;

  Integer rotationAngle;
}
