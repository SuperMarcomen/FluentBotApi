package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InputLocationMessageContent extends InputMessageContent {
  Float latitude;

  Float longitude;

  Float horizontalAccuracy;

  Integer livePeriod;

  Integer heading;

  Integer proximityAlertRadius;
}
