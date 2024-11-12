package it.marcodemartino;

public record ChatPermissions(Boolean canSendMessages, Boolean canSendAudios,
    Boolean canSendDocuments, Boolean canSendPhotos, Boolean canSendVideos,
    Boolean canSendVideoNotes, Boolean canSendVoiceNotes, Boolean canSendPolls,
    Boolean canSendOtherMessages, Boolean canAddWebPagePreviews, Boolean canChangeInfo,
    Boolean canInviteUsers, Boolean canPinMessages, Boolean canManageTopics) {
}
