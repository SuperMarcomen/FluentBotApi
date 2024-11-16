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
public final class MessageOriginUser {
  @SerializedName("type")
  String type;

  @SerializedName("date")
  long date;

  @SerializedName("sender_user")
  User senderUser;
}
