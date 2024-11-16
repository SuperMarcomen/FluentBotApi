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
public final class MaybeInaccessibleMessage {
  @SerializedName("message_id")
  long messageId;

  @SerializedName("date")
  long date;

  @SerializedName("chat")
  Chat chat;

  MaybeInaccessibleMessageContent maybeInaccessibleMessageContent;
}
