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
public final class ReplyParameters {
  @SerializedName("message_id")
  long messageId;

  @SerializedName("chat_id")
  long chatId;

  @SerializedName("allow_sending_without_reply")
  Boolean allowSendingWithoutReply;

  @SerializedName("quote")
  String quote;

  @SerializedName("quote_parse_mode")
  String quoteParseMode;

  @SerializedName("quote_entities")
  List<MessageEntity> quoteEntities;

  @SerializedName("quote_position")
  long quotePosition;
}
