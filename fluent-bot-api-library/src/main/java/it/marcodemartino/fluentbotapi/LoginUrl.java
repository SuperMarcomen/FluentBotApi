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
public final class LoginUrl {
  @SerializedName("url")
  String url;

  @SerializedName("forward_text")
  String forwardText;

  @SerializedName("bot_username")
  String botUsername;

  @SerializedName("request_write_access")
  Boolean requestWriteAccess;
}
