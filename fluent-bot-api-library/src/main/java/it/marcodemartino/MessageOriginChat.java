package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class MessageOriginChat extends MessageOrigin {
  String type;

  Integer date;

  Chat senderChat;

  String authorSignature;
}
