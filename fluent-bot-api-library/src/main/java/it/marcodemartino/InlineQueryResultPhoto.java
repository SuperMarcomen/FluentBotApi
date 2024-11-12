package it.marcodemartino;

import java.util.List;

public final class InlineQueryResultPhoto extends InlineQueryResult {
  String type;

  String id;

  String photoUrl;

  String thumbnailUrl;

  Integer photoWidth;

  Integer photoHeight;

  String title;

  String description;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  Boolean showCaptionAboveMedia;

  InlineKeyboardMarkup replyMarkup;

  InputMessageContent inputMessageContent;
}
