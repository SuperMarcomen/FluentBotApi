package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class RefundedPayment {
  String currency;

  Integer totalAmount;

  String invoicePayload;

  String telegramPaymentChargeId;

  String providerPaymentChargeId;
}
