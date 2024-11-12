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
public final class Giveaway {
  List<Chat> chats;

  Integer winnersSelectionDate;

  Integer winnerCount;

  Boolean onlyNewMembers;

  Boolean hasPublicWinners;

  String prizeDescription;

  List<String> countryCodes;

  Integer prizeStarCount;

  Integer premiumSubscriptionMonthCount;
}
