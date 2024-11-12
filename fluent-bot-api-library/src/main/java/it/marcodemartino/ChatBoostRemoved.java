package it.marcodemartino;

public record ChatBoostRemoved(Chat chat, String boostId, Integer removeDate,
    ChatBoostSource source) {
}
