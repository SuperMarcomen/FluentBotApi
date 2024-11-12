package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class Contact {
  String phoneNumber;

  String firstName;

  String lastName;

  Integer userId;

  String vcard;
}
