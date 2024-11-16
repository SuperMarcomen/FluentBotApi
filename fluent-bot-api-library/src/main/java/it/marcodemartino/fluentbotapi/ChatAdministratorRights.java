package it.marcodemartino.fluentbotapi;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ChatAdministratorRights {
  @SerializedName("is_anonymous")
  Boolean isAnonymous;

  @SerializedName("can_manage_chat")
  Boolean canManageChat;

  @SerializedName("can_delete_messages")
  Boolean canDeleteMessages;

  @SerializedName("can_manage_video_chats")
  Boolean canManageVideoChats;

  @SerializedName("can_restrict_members")
  Boolean canRestrictMembers;

  @SerializedName("can_promote_members")
  Boolean canPromoteMembers;

  @SerializedName("can_change_info")
  Boolean canChangeInfo;

  @SerializedName("can_invite_users")
  Boolean canInviteUsers;

  @SerializedName("can_post_stories")
  Boolean canPostStories;

  @SerializedName("can_edit_stories")
  Boolean canEditStories;

  @SerializedName("can_delete_stories")
  Boolean canDeleteStories;

  @SerializedName("can_post_messages")
  Boolean canPostMessages;

  @SerializedName("can_edit_messages")
  Boolean canEditMessages;

  @SerializedName("can_pin_messages")
  Boolean canPinMessages;

  @SerializedName("can_manage_topics")
  Boolean canManageTopics;
}
