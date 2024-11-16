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
public final class ChatBoostUpdated {
  @SerializedName("chat")
  Chat chat;

  @SerializedName("boost")
  ChatBoost boost;
}
