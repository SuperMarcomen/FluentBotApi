package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ChatAdministratorRights {
  Boolean isAnonymous;

  Boolean canManageChat;

  Boolean canDeleteMessages;

  Boolean canManageVideoChats;

  Boolean canRestrictMembers;

  Boolean canPromoteMembers;

  Boolean canChangeInfo;

  Boolean canInviteUsers;

  Boolean canPostStories;

  Boolean canEditStories;

  Boolean canDeleteStories;

  Boolean canPostMessages;

  Boolean canEditMessages;

  Boolean canPinMessages;

  Boolean canManageTopics;
}
