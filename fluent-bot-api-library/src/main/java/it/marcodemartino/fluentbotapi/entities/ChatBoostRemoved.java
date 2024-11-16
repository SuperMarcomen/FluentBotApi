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
public final class ChatBoostRemoved {
  @SerializedName("chat")
  Chat chat;

  @SerializedName("boost_id")
  String boostId;

  @SerializedName("remove_date")
  long removeDate;

  @SerializedName("source")
  ChatBoostSource source;
}
