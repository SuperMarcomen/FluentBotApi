package it.marcodemartino.fluentbotapi;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ChatBoost {
  @SerializedName("boost_id")
  String boostId;

  @SerializedName("add_date")
  long addDate;

  @SerializedName("expiration_date")
  long expirationDate;

  @SerializedName("source")
  ChatBoostSource source;
}
