package it.marcodemartino.fluentbotapi;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class BackgroundFillGradient {
  @SerializedName("type")
  String type;

  @SerializedName("top_color")
  long topColor;

  @SerializedName("bottom_color")
  long bottomColor;

  @SerializedName("rotation_angle")
  long rotationAngle;
}
