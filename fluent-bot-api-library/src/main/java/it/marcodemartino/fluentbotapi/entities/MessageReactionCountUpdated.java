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
public final class MessageReactionCountUpdated {
  @SerializedName("chat")
  Chat chat;

  @SerializedName("message_id")
  long messageId;

  @SerializedName("date")
  long date;

  @SerializedName("reactions")
  List<ReactionCount> reactions;
}
