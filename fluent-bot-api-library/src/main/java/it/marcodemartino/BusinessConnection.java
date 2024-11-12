package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class BusinessConnection {
  String id;

  User user;

  Integer userChatId;

  Integer date;

  Boolean canReply;

  Boolean isEnabled;
}
