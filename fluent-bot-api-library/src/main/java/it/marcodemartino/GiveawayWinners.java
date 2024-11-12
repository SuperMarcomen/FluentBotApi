package it.marcodemartino;

import java.util.List;

public record GiveawayWinners(Chat chat, Integer giveawayMessageId, Integer winnersSelectionDate,
    Integer winnerCount, List<User> winners, Integer additionalChatCount, Integer prizeStarCount,
    Integer premiumSubscriptionMonthCount, Integer unclaimedPrizeCount, Boolean onlyNewMembers,
    Boolean wasRefunded, String prizeDescription) {
}
