package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InlineQueryResultCachedSticker extends InlineQueryResult {
  String type;

  String id;

  String stickerFileId;

  InlineKeyboardMarkup replyMarkup;

  InputMessageContent inputMessageContent;
}
