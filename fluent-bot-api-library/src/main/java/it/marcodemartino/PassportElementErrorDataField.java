package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class PassportElementErrorDataField extends PassportElementError {
  String source;

  String type;

  String fieldName;

  String dataHash;

  String message;
}
