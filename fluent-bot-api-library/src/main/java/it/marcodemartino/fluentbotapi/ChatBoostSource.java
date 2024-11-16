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
public final class ChatBoostSource {
  @SerializedName("source")
  String source;

  @SerializedName("user")
  User user;

  ChatBoostSourceContent chatBoostSourceContent;
}
