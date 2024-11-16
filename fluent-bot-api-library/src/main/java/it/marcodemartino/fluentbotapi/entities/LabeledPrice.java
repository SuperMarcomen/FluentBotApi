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
public final class LabeledPrice {
  @SerializedName("label")
  String label;

  @SerializedName("amount")
  long amount;
}
