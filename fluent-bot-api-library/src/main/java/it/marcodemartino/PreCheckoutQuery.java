package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class PreCheckoutQuery {
  String id;

  User from;

  String currency;

  Integer totalAmount;

  String invoicePayload;

  String shippingOptionId;

  OrderInfo orderInfo;
}
