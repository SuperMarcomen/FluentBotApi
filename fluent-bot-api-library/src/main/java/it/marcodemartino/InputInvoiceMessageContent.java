package it.marcodemartino;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InputInvoiceMessageContent extends InputMessageContent {
  String title;

  String description;

  String payload;

  String providerToken;

  String currency;

  List<LabeledPrice> prices;

  Integer maxTipAmount;

  List<Integer> suggestedTipAmounts;

  String providerData;

  String photoUrl;

  Integer photoSize;

  Integer photoWidth;

  Integer photoHeight;

  Boolean needName;

  Boolean needPhoneNumber;

  Boolean needEmail;

  Boolean needShippingAddress;

  Boolean sendPhoneNumberToProvider;

  Boolean sendEmailToProvider;

  Boolean isFlexible;
}