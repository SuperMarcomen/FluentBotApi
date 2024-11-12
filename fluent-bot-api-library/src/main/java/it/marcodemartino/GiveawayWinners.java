package it.marcodemartino;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class GiveawayWinners {
  Chat chat;

  Integer giveawayMessageId;

  Integer winnersSelectionDate;

  Integer winnerCount;

  List<User> winners;

  Integer additionalChatCount;

  Integer prizeStarCount;

  Integer premiumSubscriptionMonthCount;

  Integer unclaimedPrizeCount;

  Boolean onlyNewMembers;

  Boolean wasRefunded;

  String prizeDescription;
}
