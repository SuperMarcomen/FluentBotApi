package it.marcodemartino;

public record ChatBoost(String boostId, Integer addDate, Integer expirationDate,
    ChatBoostSource source) {
}
