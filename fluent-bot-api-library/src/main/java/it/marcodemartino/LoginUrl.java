package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class LoginUrl {
  String url;

  String forwardText;

  String botUsername;

  Boolean requestWriteAccess;
}
