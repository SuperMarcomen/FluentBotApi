package it.marcodemartino.fluentbotapi;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class GiveawayCompleted {
  @SerializedName("winner_count")
  long winnerCount;

  @SerializedName("unclaimed_prize_count")
  long unclaimedPrizeCount;

  @SerializedName("giveaway_message")
  Message giveawayMessage;

  @SerializedName("is_star_giveaway")
  Boolean isStarGiveaway;
}
