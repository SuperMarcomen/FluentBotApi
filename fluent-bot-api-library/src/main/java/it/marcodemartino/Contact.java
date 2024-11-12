package it.marcodemartino;

public record Contact(String phoneNumber, String firstName, String lastName, Integer userId,
    String vcard) {
}
