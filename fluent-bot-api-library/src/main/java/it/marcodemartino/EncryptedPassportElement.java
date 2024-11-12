package it.marcodemartino;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class EncryptedPassportElement {
  String type;

  String data;

  String phoneNumber;

  String email;

  List<PassportFile> files;

  PassportFile frontSide;

  PassportFile reverseSide;

  PassportFile selfie;

  List<PassportFile> translation;

  String hash;
}
