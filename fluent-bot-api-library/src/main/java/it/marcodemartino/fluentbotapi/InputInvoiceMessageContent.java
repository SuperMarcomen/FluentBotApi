package it.marcodemartino.fluentbotapi;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InputInvoiceMessageContent {
  @SerializedName("title")
  String title;

  @SerializedName("description")
  String description;

  @SerializedName("payload")
  String payload;

  @SerializedName("provider_token")
  String providerToken;

  @SerializedName("currency")
  String currency;

  @SerializedName("prices")
  List<LabeledPrice> prices;

  @SerializedName("max_tip_amount")
  long maxTipAmount;

  @SerializedName("suggested_tip_amounts")
  List<Long> suggestedTipAmounts;

  @SerializedName("provider_data")
  String providerData;

  @SerializedName("photo_url")
  String photoUrl;

  @SerializedName("photo_size")
  long photoSize;

  @SerializedName("photo_width")
  long photoWidth;

  @SerializedName("photo_height")
  long photoHeight;

  @SerializedName("need_name")
  Boolean needName;

  @SerializedName("need_phone_number")
  Boolean needPhoneNumber;

  @SerializedName("need_email")
  Boolean needEmail;

  @SerializedName("need_shipping_address")
  Boolean needShippingAddress;

  @SerializedName("send_phone_number_to_provider")
  Boolean sendPhoneNumberToProvider;

  @SerializedName("send_email_to_provider")
  Boolean sendEmailToProvider;

  @SerializedName("is_flexible")
  Boolean isFlexible;
}
