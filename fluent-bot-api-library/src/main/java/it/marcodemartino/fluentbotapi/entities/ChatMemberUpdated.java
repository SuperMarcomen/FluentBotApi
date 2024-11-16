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
public final class ChatMemberUpdated {
  @SerializedName("chat")
  Chat chat;

  @SerializedName("from")
  User from;

  @SerializedName("date")
  long date;

  @SerializedName("old_chat_member")
  ChatMember oldChatMember;

  @SerializedName("new_chat_member")
  ChatMember newChatMember;

  @SerializedName("invite_link")
  ChatInviteLink inviteLink;

  @SerializedName("via_join_request")
  Boolean viaJoinRequest;

  @SerializedName("via_chat_folder_invite_link")
  Boolean viaChatFolderInviteLink;
}
