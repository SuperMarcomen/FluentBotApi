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
public final class TransactionPartnerUser {
  @SerializedName("type")
  String type;

  @SerializedName("user")
  User user;

  @SerializedName("invoice_payload")
  String invoicePayload;

  @SerializedName("paid_media")
  List<PaidMedia> paidMedia;

  @SerializedName("paid_media_payload")
  String paidMediaPayload;
}
