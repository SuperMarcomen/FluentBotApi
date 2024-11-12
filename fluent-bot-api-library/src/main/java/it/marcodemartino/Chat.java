package it.marcodemartino;

public record Chat(Integer id, String type, String title, String username, String firstName,
    String lastName, Boolean isForum) {
}
