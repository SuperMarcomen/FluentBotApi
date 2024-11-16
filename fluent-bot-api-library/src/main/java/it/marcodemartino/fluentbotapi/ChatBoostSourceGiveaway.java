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
public final class ChatBoostSourceGiveaway {
  @SerializedName("source")
  String source;

  @SerializedName("giveaway_message_id")
  long giveawayMessageId;

  @SerializedName("user")
  User user;

  @SerializedName("prize_star_count")
  long prizeStarCount;

  @SerializedName("is_unclaimed")
  Boolean isUnclaimed;
}
