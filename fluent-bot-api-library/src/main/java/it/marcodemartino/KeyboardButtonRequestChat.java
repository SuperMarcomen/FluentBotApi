package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class KeyboardButtonRequestChat {
  Integer requestId;

  Boolean chatIsChannel;

  Boolean chatIsForum;

  Boolean chatHasUsername;

  Boolean chatIsCreated;

  ChatAdministratorRights userAdministratorRights;

  ChatAdministratorRights botAdministratorRights;

  Boolean botIsMember;

  Boolean requestTitle;

  Boolean requestUsername;

  Boolean requestPhoto;
}
