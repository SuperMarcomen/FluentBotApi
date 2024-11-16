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
public final class Location {
  @SerializedName("latitude")
  float latitude;

  @SerializedName("longitude")
  float longitude;

  @SerializedName("horizontal_accuracy")
  float horizontalAccuracy;

  @SerializedName("live_period")
  long livePeriod;

  @SerializedName("heading")
  long heading;

  @SerializedName("proximity_alert_radius")
  long proximityAlertRadius;
}
