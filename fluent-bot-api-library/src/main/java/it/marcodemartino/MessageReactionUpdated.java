package it.marcodemartino;

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
  Chat chat;

  Integer messageId;

  User user;

  Chat actorChat;

  Integer date;

  List<ReactionType> oldReaction;

  List<ReactionType> newReaction;
}
