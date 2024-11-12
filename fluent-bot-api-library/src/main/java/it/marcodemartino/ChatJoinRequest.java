package it.marcodemartino;

public record ChatJoinRequest(Chat chat, User from, Integer userChatId, Integer date, String bio,
    ChatInviteLink inviteLink) {
}
