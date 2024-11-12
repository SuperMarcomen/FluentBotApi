package it.marcodemartino;

import java.util.List;

public record ReplyParameters(Integer messageId, Integer chatId, Boolean allowSendingWithoutReply,
    String quote, String quoteParseMode, List<MessageEntity> quoteEntities, Integer quotePosition) {
}
