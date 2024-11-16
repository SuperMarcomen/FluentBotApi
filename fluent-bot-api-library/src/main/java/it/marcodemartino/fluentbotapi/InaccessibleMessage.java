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
public final class InaccessibleMessage {
  @SerializedName("chat")
  Chat chat;

  @SerializedName("message_id")
  long messageId;

  @SerializedName("date")
  long date;
}
