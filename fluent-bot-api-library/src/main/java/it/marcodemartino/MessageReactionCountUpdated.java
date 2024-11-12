package it.marcodemartino;

import java.util.List;

public record MessageReactionCountUpdated(Chat chat, Integer messageId, Integer date,
    List<ReactionCount> reactions) {
}
