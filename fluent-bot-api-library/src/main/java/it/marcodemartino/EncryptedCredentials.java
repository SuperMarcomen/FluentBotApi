package it.marcodemartino;

public record EncryptedCredentials(String data, String hash, String secret) {
}
