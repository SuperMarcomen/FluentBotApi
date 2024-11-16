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
public final class MessageReactionCountUpdated {
  Chat chat;

  Integer messageId;

  Integer date;

  List<ReactionCount> reactions;
}