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
public final class PollAnswer {
  @SerializedName("poll_id")
  String pollId;

  @SerializedName("voter_chat")
  Chat voterChat;

  @SerializedName("user")
  User user;

  @SerializedName("option_ids")
  List<Long> optionIds;
}
