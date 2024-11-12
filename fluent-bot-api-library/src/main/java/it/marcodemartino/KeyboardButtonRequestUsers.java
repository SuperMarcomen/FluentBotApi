package it.marcodemartino;

public record KeyboardButtonRequestUsers(Integer requestId, Boolean userIsBot,
    Boolean userIsPremium, Integer maxQuantity, Boolean requestName, Boolean requestUsername,
    Boolean requestPhoto) {
}
