package it.marcodemartino;

import java.util.List;

public final class InlineQueryResultCachedPhoto extends InlineQueryResult {
  String type;

  String id;

  String photoFileId;

  String title;

  String description;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  Boolean showCaptionAboveMedia;

  InlineKeyboardMarkup replyMarkup;

  InputMessageContent inputMessageContent;
}
