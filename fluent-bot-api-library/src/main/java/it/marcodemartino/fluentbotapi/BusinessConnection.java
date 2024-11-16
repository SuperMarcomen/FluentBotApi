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
public final class BusinessConnection {
  @SerializedName("id")
  String id;

  @SerializedName("user")
  User user;

  @SerializedName("user_chat_id")
  long userChatId;

  @SerializedName("date")
  long date;

  @SerializedName("can_reply")
  Boolean canReply;

  @SerializedName("is_enabled")
  Boolean isEnabled;
}
