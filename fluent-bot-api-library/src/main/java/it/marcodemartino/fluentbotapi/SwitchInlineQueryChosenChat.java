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
public final class SwitchInlineQueryChosenChat {
  @SerializedName("query")
  String query;

  @SerializedName("allow_user_chats")
  Boolean allowUserChats;

  @SerializedName("allow_bot_chats")
  Boolean allowBotChats;

  @SerializedName("allow_group_chats")
  Boolean allowGroupChats;

  @SerializedName("allow_channel_chats")
  Boolean allowChannelChats;
}
