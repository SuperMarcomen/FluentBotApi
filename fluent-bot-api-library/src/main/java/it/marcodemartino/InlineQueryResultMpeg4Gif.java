package it.marcodemartino;

import java.util.List;

public final class InlineQueryResultMpeg4Gif extends InlineQueryResult {
  String type;

  String id;

  String mpeg4Url;

  Integer mpeg4Width;

  Integer mpeg4Height;

  Integer mpeg4Duration;

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
