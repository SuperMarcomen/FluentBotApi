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
public final class MessageOriginChannel {
  @SerializedName("type")
  String type;

  @SerializedName("date")
  long date;

  @SerializedName("chat")
  Chat chat;

  @SerializedName("message_id")
  long messageId;

  @SerializedName("author_signature")
  String authorSignature;
}
