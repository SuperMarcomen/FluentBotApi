package it.marcodemartino;

import java.util.List;

public final class InlineQueryResultCachedDocument extends InlineQueryResult {
  String type;

  String id;

  String title;

  String documentFileId;

  String description;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  InlineKeyboardMarkup replyMarkup;

  InputMessageContent inputMessageContent;
}
