package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class User {
  Integer id;

  Boolean isBot;

  String firstName;

  String lastName;

  String username;

  String languageCode;

  Boolean isPremium;

  Boolean addedToAttachmentMenu;

  Boolean canJoinGroups;

  Boolean canReadAllGroupMessages;

  Boolean supportsInlineQueries;

  Boolean canConnectToBusiness;

  Boolean hasMainWebApp;
}
