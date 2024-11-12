package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class KeyboardButtonRequestUsers {
  Integer requestId;

  Boolean userIsBot;

  Boolean userIsPremium;

  Integer maxQuantity;

  Boolean requestName;

  Boolean requestUsername;

  Boolean requestPhoto;
}
