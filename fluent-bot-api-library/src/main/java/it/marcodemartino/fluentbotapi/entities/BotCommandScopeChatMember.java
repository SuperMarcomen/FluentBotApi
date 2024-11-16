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
public final class BotCommandScopeChatMember {
  @SerializedName("type")
  String type;

  @SerializedName("chat_id")
  long chatId;

  @SerializedName("user_id")
  long userId;
}
