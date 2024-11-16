package it.marcodemartino.fluentbotapi.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ChatPermissions {
  @SerializedName("can_send_messages")
  Boolean canSendMessages;

  @SerializedName("can_send_audios")
  Boolean canSendAudios;

  @SerializedName("can_send_documents")
  Boolean canSendDocuments;

  @SerializedName("can_send_photos")
  Boolean canSendPhotos;

  @SerializedName("can_send_videos")
  Boolean canSendVideos;

  @SerializedName("can_send_video_notes")
  Boolean canSendVideoNotes;

  @SerializedName("can_send_voice_notes")
  Boolean canSendVoiceNotes;

  @SerializedName("can_send_polls")
  Boolean canSendPolls;

  @SerializedName("can_send_other_messages")
  Boolean canSendOtherMessages;

  @SerializedName("can_add_web_page_previews")
  Boolean canAddWebPagePreviews;

  @SerializedName("can_change_info")
  Boolean canChangeInfo;

  @SerializedName("can_invite_users")
  Boolean canInviteUsers;

  @SerializedName("can_pin_messages")
  Boolean canPinMessages;

  @SerializedName("can_manage_topics")
  Boolean canManageTopics;
}
