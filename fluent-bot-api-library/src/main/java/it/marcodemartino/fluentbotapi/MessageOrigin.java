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
public final class MessageOrigin {
  @SerializedName("type")
  String type;

  @SerializedName("date")
  long date;

  MessageOriginContent messageOriginContent;
}
