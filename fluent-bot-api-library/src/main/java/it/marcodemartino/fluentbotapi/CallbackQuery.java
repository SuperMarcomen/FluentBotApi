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
public final class CallbackQuery {
  @SerializedName("id")
  String id;

  @SerializedName("from")
  User from;

  @SerializedName("message")
  MaybeInaccessibleMessage message;

  @SerializedName("inline_message_id")
  String inlineMessageId;

  @SerializedName("chat_instance")
  String chatInstance;

  @SerializedName("data")
  String data;

  @SerializedName("game_short_name")
  String gameShortName;
}
