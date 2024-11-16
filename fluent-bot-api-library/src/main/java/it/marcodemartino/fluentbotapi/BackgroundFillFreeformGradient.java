package it.marcodemartino.fluentbotapi;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class BackgroundFillFreeformGradient {
  @SerializedName("type")
  String type;

  @SerializedName("colors")
  List<Long> colors;
}
