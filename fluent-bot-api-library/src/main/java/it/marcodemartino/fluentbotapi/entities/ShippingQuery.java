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
public final class ShippingQuery {
  @SerializedName("id")
  String id;

  @SerializedName("from")
  User from;

  @SerializedName("invoice_payload")
  String invoicePayload;

  @SerializedName("shipping_address")
  ShippingAddress shippingAddress;
}
