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
public final class BackgroundTypePattern {
  @SerializedName("type")
  String type;

  @SerializedName("document")
  Document document;

  @SerializedName("fill")
  BackgroundFill fill;

  @SerializedName("intensity")
  long intensity;

  @SerializedName("is_inverted")
  Boolean isInverted;

  @SerializedName("is_moving")
  Boolean isMoving;
}
