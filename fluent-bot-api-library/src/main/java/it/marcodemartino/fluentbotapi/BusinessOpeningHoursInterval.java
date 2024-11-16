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
public final class BusinessOpeningHoursInterval {
  @SerializedName("opening_minute")
  long openingMinute;

  @SerializedName("closing_minute")
  long closingMinute;
}
