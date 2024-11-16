package it.marcodemartino.fluentbotapi.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ChosenInlineResult {
  @SerializedName("result_id")
  String resultId;

  @SerializedName("from")
  User from;

  @SerializedName("location")
  Location location;

  @SerializedName("inline_message_id")
  String inlineMessageId;

  @SerializedName("query")
  String query;
}
