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
public final class ChatJoinRequest {
  @SerializedName("chat")
  Chat chat;

  @SerializedName("from")
  User from;

  @SerializedName("user_chat_id")
  long userChatId;

  @SerializedName("date")
  long date;

  @SerializedName("bio")
  String bio;

  @SerializedName("invite_link")
  ChatInviteLink inviteLink;
}
