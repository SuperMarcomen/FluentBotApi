package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ChatMemberOwner extends ChatMember {
  String status;

  User user;

  Boolean isAnonymous;

  String customTitle;
}
