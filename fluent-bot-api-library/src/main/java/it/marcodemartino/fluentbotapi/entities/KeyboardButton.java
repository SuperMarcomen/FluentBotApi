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
public final class KeyboardButton {
  @SerializedName("text")
  String text;

  @SerializedName("request_users")
  KeyboardButtonRequestUsers requestUsers;

  @SerializedName("request_chat")
  KeyboardButtonRequestChat requestChat;

  @SerializedName("request_contact")
  Boolean requestContact;

  @SerializedName("request_location")
  Boolean requestLocation;

  @SerializedName("request_poll")
  KeyboardButtonPollType requestPoll;

  @SerializedName("web_app")
  WebAppInfo webApp;
}
