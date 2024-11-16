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
public final class MaskPosition {
  @SerializedName("point")
  String point;

  @SerializedName("x_shift")
  float xShift;

  @SerializedName("y_shift")
  float yShift;

  @SerializedName("scale")
  float scale;
}
