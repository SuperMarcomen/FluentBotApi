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
public final class ShippingAddress {
  @SerializedName("country_code")
  String countryCode;

  @SerializedName("state")
  String state;

  @SerializedName("city")
  String city;

  @SerializedName("street_line1")
  String streetLine1;

  @SerializedName("street_line2")
  String streetLine2;

  @SerializedName("post_code")
  String postCode;
}
