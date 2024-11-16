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
public final class ChatMemberBanned {
  @SerializedName("status")
  String status;

  @SerializedName("user")
  User user;

  @SerializedName("until_date")
  long untilDate;
}
