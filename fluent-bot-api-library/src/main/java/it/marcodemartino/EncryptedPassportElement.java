package it.marcodemartino;

import java.util.List;

public record EncryptedPassportElement(String type, String data, String phoneNumber, String email,
    List<PassportFile> files, PassportFile frontSide, PassportFile reverseSide, PassportFile selfie,
    List<PassportFile> translation, String hash) {
}
