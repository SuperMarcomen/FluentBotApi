package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ShippingAddress {
  String countryCode;

  String state;

  String city;

  String streetLine1;

  String streetLine2;

  String postCode;
}
