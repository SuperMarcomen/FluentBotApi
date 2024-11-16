package it.marcodemartino.fluentbotapi.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class BackgroundTypeFill {
  @SerializedName("type")
  String type;

  @SerializedName("fill")
  BackgroundFill fill;

  @SerializedName("dark_theme_dimming")
  long darkThemeDimming;
}
