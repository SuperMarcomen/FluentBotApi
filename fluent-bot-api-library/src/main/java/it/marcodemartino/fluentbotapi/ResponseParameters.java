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
public final class ResponseParameters {
  @SerializedName("migrate_to_chat_id")
  long migrateToChatId;

  @SerializedName("retry_after")
  long retryAfter;
}
