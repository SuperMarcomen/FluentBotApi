package it.marcodemartino.fluentbotapi.entities;

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
public final class BusinessMessagesDeleted {
  @SerializedName("business_connection_id")
  String businessConnectionId;

  @SerializedName("chat")
  Chat chat;

  @SerializedName("message_ids")
  List<Long> messageIds;
}
