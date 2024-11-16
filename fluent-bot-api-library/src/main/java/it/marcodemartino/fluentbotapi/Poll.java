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
public final class Poll {
  @SerializedName("id")
  String id;

  @SerializedName("question")
  String question;

  @SerializedName("question_entities")
  List<MessageEntity> questionEntities;

  @SerializedName("options")
  List<PollOption> options;

  @SerializedName("total_voter_count")
  long totalVoterCount;

  @SerializedName("is_closed")
  Boolean isClosed;

  @SerializedName("is_anonymous")
  Boolean isAnonymous;

  @SerializedName("type")
  String type;

  @SerializedName("allows_multiple_answers")
  Boolean allowsMultipleAnswers;

  @SerializedName("correct_option_id")
  long correctOptionId;

  @SerializedName("explanation")
  String explanation;

  @SerializedName("explanation_entities")
  List<MessageEntity> explanationEntities;

  @SerializedName("open_period")
  long openPeriod;

  @SerializedName("close_date")
  long closeDate;
}
