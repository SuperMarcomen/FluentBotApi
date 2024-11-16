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
public final class RefundedPayment {
  @SerializedName("currency")
  String currency;

  @SerializedName("total_amount")
  long totalAmount;

  @SerializedName("invoice_payload")
  String invoicePayload;

  @SerializedName("telegram_payment_charge_id")
  String telegramPaymentChargeId;

  @SerializedName("provider_payment_charge_id")
  String providerPaymentChargeId;
}
