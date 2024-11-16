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
public final class BackgroundTypeWallpaper {
  @SerializedName("type")
  String type;

  @SerializedName("document")
  Document document;

  @SerializedName("dark_theme_dimming")
  long darkThemeDimming;

  @SerializedName("is_blurred")
  Boolean isBlurred;

  @SerializedName("is_moving")
  Boolean isMoving;
}
