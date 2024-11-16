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
public final class ForceReply {
  @SerializedName("force_reply")
  Boolean forceReply;

  @SerializedName("input_field_placeholder")
  String inputFieldPlaceholder;

  @SerializedName("selective")
  Boolean selective;
}
