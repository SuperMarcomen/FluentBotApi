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
public final class KeyboardButtonRequestChat {
  @SerializedName("request_id")
  long requestId;

  @SerializedName("chat_is_channel")
  Boolean chatIsChannel;

  @SerializedName("chat_is_forum")
  Boolean chatIsForum;

  @SerializedName("chat_has_username")
  Boolean chatHasUsername;

  @SerializedName("chat_is_created")
  Boolean chatIsCreated;

  @SerializedName("user_administrator_rights")
  ChatAdministratorRights userAdministratorRights;

  @SerializedName("bot_administrator_rights")
  ChatAdministratorRights botAdministratorRights;

  @SerializedName("bot_is_member")
  Boolean botIsMember;

  @SerializedName("request_title")
  Boolean requestTitle;

  @SerializedName("request_username")
  Boolean requestUsername;

  @SerializedName("request_photo")
  Boolean requestPhoto;
}
