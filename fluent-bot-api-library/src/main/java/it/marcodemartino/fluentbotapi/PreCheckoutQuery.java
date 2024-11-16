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
public final class PreCheckoutQuery {
  @SerializedName("id")
  String id;

  @SerializedName("from")
  User from;

  @SerializedName("currency")
  String currency;

  @SerializedName("total_amount")
  long totalAmount;

  @SerializedName("invoice_payload")
  String invoicePayload;

  @SerializedName("shipping_option_id")
  String shippingOptionId;

  @SerializedName("order_info")
  OrderInfo orderInfo;
}
