package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class SuccessfulPayment {
  String currency;

  Integer totalAmount;

  String invoicePayload;

  String shippingOptionId;

  OrderInfo orderInfo;

  String telegramPaymentChargeId;

  String providerPaymentChargeId;
}
