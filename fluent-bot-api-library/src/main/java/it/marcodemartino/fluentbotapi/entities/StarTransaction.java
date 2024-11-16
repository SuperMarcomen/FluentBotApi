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
public final class StarTransaction {
  @SerializedName("id")
  String id;

  @SerializedName("amount")
  long amount;

  @SerializedName("date")
  long date;

  @SerializedName("source")
  TransactionPartner source;

  @SerializedName("receiver")
  TransactionPartner receiver;
}
