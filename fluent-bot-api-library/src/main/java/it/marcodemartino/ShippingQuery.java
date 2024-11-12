package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ShippingQuery {
  String id;

  User from;

  String invoicePayload;

  ShippingAddress shippingAddress;
}
