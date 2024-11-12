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
public final class Poll {
  String id;

  String question;

  List<MessageEntity> questionEntities;

  List<PollOption> options;

  Integer totalVoterCount;

  Boolean isClosed;

  Boolean isAnonymous;

  String type;

  Boolean allowsMultipleAnswers;

  Integer correctOptionId;

  String explanation;

  List<MessageEntity> explanationEntities;

  Integer openPeriod;

  Integer closeDate;
}
