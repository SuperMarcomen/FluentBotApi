package it.marcodemartino;

import java.util.List;

public record MessageReactionUpdated(Chat chat, Integer messageId, User user, Chat actorChat,
    Integer date, List<ReactionType> oldReaction, List<ReactionType> newReaction) {
}
