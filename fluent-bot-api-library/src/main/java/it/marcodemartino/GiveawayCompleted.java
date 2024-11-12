package it.marcodemartino;

public record GiveawayCompleted(Integer winnerCount, Integer unclaimedPrizeCount,
    Message giveawayMessage, Boolean isStarGiveaway) {
}
