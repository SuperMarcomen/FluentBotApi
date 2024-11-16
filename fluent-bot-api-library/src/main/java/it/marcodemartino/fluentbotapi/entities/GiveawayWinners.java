package it.marcodemartino.fluentbotapi.entities;

import com.google.gson.annotations.SerializedName;
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
  @SerializedName("chat")
  Chat chat;

  @SerializedName("giveaway_message_id")
  long giveawayMessageId;

  @SerializedName("winners_selection_date")
  long winnersSelectionDate;

  @SerializedName("winner_count")
  long winnerCount;

  @SerializedName("winners")
  List<User> winners;

  @SerializedName("additional_chat_count")
  long additionalChatCount;

  @SerializedName("prize_star_count")
  long prizeStarCount;

  @SerializedName("premium_subscription_month_count")
  long premiumSubscriptionMonthCount;

  @SerializedName("unclaimed_prize_count")
  long unclaimedPrizeCount;

  @SerializedName("only_new_members")
  Boolean onlyNewMembers;

  @SerializedName("was_refunded")
  Boolean wasRefunded;

  @SerializedName("prize_description")
  String prizeDescription;
}
