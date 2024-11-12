package it.marcodemartino;

import java.util.List;

public record Giveaway(List<Chat> chats, Integer winnersSelectionDate, Integer winnerCount,
    Boolean onlyNewMembers, Boolean hasPublicWinners, String prizeDescription,
    List<String> countryCodes, Integer prizeStarCount, Integer premiumSubscriptionMonthCount) {
}
