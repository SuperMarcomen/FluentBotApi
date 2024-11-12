package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class Chat {
  Integer id;

  String type;

  String title;

  String username;

  String firstName;

  String lastName;

  Boolean isForum;
}
