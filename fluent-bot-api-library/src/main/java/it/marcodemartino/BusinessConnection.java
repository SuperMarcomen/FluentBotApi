package it.marcodemartino;

public record BusinessConnection(String id, User user, Integer userChatId, Integer date,
    Boolean canReply, Boolean isEnabled) {
}
