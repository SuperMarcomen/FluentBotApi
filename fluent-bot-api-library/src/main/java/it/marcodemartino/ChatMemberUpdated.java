package it.marcodemartino;

public record ChatMemberUpdated(Chat chat, User from, Integer date, ChatMember oldChatMember,
    ChatMember newChatMember, ChatInviteLink inviteLink, Boolean viaJoinRequest,
    Boolean viaChatFolderInviteLink) {
}
