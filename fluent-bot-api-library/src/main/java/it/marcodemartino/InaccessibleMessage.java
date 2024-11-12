package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InaccessibleMessage extends MaybeInaccessibleMessage {
  Chat chat;

  Integer messageId;

  Integer date;
}
