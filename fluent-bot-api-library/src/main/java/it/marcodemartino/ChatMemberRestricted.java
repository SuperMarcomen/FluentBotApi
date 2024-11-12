package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ChatMemberRestricted extends ChatMember {
  String status;

  User user;

  Boolean isMember;

  Boolean canSendMessages;

  Boolean canSendAudios;

  Boolean canSendDocuments;

  Boolean canSendPhotos;

  Boolean canSendVideos;

  Boolean canSendVideoNotes;

  Boolean canSendVoiceNotes;

  Boolean canSendPolls;

  Boolean canSendOtherMessages;

  Boolean canAddWebPagePreviews;

  Boolean canChangeInfo;

  Boolean canInviteUsers;

  Boolean canPinMessages;

  Boolean canManageTopics;

  Integer untilDate;
}
