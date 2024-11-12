package it.marcodemartino;

import java.util.List;

public final class InlineQueryResultCachedVoice extends InlineQueryResult {
  String type;

  String id;

  String voiceFileId;

  String title;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  InlineKeyboardMarkup replyMarkup;

  InputMessageContent inputMessageContent;
}
