package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ChatBoostSourceGiveaway extends ChatBoostSource {
  String source;

  Integer giveawayMessageId;

  User user;

  Integer prizeStarCount;

  Boolean isUnclaimed;
}
