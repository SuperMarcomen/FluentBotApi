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
public final class Invoice {
  @SerializedName("title")
  String title;

  @SerializedName("description")
  String description;

  @SerializedName("start_parameter")
  String startParameter;

  @SerializedName("currency")
  String currency;

  @SerializedName("total_amount")
  long totalAmount;
}
