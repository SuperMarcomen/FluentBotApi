package it.marcodemartino;

import java.util.List;

public record PassportData(List<EncryptedPassportElement> data, EncryptedCredentials credentials) {
}
