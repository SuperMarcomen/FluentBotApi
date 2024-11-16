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
public final class PaidMediaPurchased {
  @SerializedName("from")
  User from;

  @SerializedName("paid_media_payload")
  String paidMediaPayload;
}
