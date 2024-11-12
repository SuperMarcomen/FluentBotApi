package it.marcodemartino;

import java.util.List;

public final class InlineQueryResultCachedAudio extends InlineQueryResult {
  String type;

  String id;

  String audioFileId;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  InlineKeyboardMarkup replyMarkup;

  InputMessageContent inputMessageContent;
}
