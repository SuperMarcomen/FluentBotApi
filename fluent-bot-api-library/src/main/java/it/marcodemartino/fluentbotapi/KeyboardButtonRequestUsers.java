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
public final class KeyboardButtonRequestUsers {
  @SerializedName("request_id")
  long requestId;

  @SerializedName("user_is_bot")
  Boolean userIsBot;

  @SerializedName("user_is_premium")
  Boolean userIsPremium;

  @SerializedName("max_quantity")
  long maxQuantity;

  @SerializedName("request_name")
  Boolean requestName;

  @SerializedName("request_username")
  Boolean requestUsername;

  @SerializedName("request_photo")
  Boolean requestPhoto;
}
