package it.marcodemartino.fluentbotapi;

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
public final class MessageReactionUpdated {
  @SerializedName("chat")
  Chat chat;

  @SerializedName("message_id")
  long messageId;

  @SerializedName("user")
  User user;

  @SerializedName("actor_chat")
  Chat actorChat;

  @SerializedName("date")
  long date;

  @SerializedName("old_reaction")
  List<ReactionType> oldReaction;

  @SerializedName("new_reaction")
  List<ReactionType> newReaction;
}
