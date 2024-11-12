package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ChatJoinRequest {
  Chat chat;

  User from;

  Integer userChatId;

  Integer date;

  String bio;

  ChatInviteLink inviteLink;
}
