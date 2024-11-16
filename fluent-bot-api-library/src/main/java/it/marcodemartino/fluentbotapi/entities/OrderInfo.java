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
public final class OrderInfo {
  @SerializedName("name")
  String name;

  @SerializedName("phone_number")
  String phoneNumber;

  @SerializedName("email")
  String email;

  @SerializedName("shipping_address")
  ShippingAddress shippingAddress;
}
