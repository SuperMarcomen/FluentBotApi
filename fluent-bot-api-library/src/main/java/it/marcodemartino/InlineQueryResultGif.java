package it.marcodemartino;

import java.util.List;

public final class InlineQueryResultGif extends InlineQueryResult {
  String type;

  String id;

  String gifUrl;

  Integer gifWidth;

  Integer gifHeight;

  Integer gifDuration;

  String thumbnailUrl;

  String thumbnailMimeType;

  String title;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  Boolean showCaptionAboveMedia;

  InlineKeyboardMarkup replyMarkup;

  InputMessageContent inputMessageContent;
}
