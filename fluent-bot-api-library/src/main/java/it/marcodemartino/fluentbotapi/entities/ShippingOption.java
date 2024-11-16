package it.marcodemartino.fluentbotapi.entities;

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
public final class ShippingOption {
  @SerializedName("id")
  String id;

  @SerializedName("title")
  String title;

  @SerializedName("prices")
  List<LabeledPrice> prices;
}
