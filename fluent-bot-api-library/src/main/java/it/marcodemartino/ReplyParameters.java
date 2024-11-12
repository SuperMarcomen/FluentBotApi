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
public final class ReplyParameters {
  Integer messageId;

  Integer chatId;

  Boolean allowSendingWithoutReply;

  String quote;

  String quoteParseMode;

  List<MessageEntity> quoteEntities;

  Integer quotePosition;
}
