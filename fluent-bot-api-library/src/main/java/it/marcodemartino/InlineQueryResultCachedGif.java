package it.marcodemartino;

import java.util.List;

public final class InlineQueryResultCachedGif extends InlineQueryResult {
  String type;

  String id;

  String gifFileId;

  String title;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  Boolean showCaptionAboveMedia;

  InlineKeyboardMarkup replyMarkup;

  InputMessageContent inputMessageContent;
}
