package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class Venue {
  Location location;

  String title;

  String address;

  String foursquareId;

  String foursquareType;

  String googlePlaceId;

  String googlePlaceType;
}
