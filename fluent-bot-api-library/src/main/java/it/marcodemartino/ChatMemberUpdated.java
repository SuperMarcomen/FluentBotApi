package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ChatMemberUpdated {
  Chat chat;

  User from;

  Integer date;

  ChatMember oldChatMember;

  ChatMember newChatMember;

  ChatInviteLink inviteLink;

  Boolean viaJoinRequest;

  Boolean viaChatFolderInviteLink;
}
