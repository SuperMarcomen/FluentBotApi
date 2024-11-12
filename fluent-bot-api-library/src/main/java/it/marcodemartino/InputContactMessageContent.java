package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InputContactMessageContent extends InputMessageContent {
  String phoneNumber;

  String firstName;

  String lastName;

  String vcard;
}
