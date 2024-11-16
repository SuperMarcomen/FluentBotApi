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
public final class ReactionTypeEmoji {
  @SerializedName("type")
  String type;

  @SerializedName("emoji")
  String emoji;
}
