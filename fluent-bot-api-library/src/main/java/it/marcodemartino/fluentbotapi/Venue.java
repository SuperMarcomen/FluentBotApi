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
public final class Venue {
  @SerializedName("location")
  Location location;

  @SerializedName("title")
  String title;

  @SerializedName("address")
  String address;

  @SerializedName("foursquare_id")
  String foursquareId;

  @SerializedName("foursquare_type")
  String foursquareType;

  @SerializedName("google_place_id")
  String googlePlaceId;

  @SerializedName("google_place_type")
  String googlePlaceType;
}
