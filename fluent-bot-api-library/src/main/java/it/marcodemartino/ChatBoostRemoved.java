package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ChatBoostRemoved {
  Chat chat;

  String boostId;

  Integer removeDate;

  ChatBoostSource source;
}
