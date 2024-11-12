package it.marcodemartino;

public record Invoice(String title, String description, String startParameter, String currency,
    Integer totalAmount) {
}
