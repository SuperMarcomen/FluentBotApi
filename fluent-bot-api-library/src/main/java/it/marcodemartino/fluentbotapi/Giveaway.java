package it.marcodemartino.fluentbotapi;

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
public final class Giveaway {
  @SerializedName("chats")
  List<Chat> chats;

  @SerializedName("winners_selection_date")
  long winnersSelectionDate;

  @SerializedName("winner_count")
  long winnerCount;

  @SerializedName("only_new_members")
  Boolean onlyNewMembers;

  @SerializedName("has_public_winners")
  Boolean hasPublicWinners;

  @SerializedName("prize_description")
  String prizeDescription;

  @SerializedName("country_codes")
  List<String> countryCodes;

  @SerializedName("prize_star_count")
  long prizeStarCount;

  @SerializedName("premium_subscription_month_count")
  long premiumSubscriptionMonthCount;
}
