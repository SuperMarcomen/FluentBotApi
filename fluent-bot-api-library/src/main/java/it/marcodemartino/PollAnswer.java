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
public final class PollAnswer {
  String pollId;

  Chat voterChat;

  User user;

  List<Integer> optionIds;
}
