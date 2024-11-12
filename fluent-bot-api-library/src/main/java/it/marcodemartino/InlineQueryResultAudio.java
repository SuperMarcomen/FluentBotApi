package it.marcodemartino;

import java.util.List;

public final class InlineQueryResultAudio extends InlineQueryResult {
  String type;

  String id;

  String audioUrl;

  String title;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  String performer;

  Integer audioDuration;

  InlineKeyboardMarkup replyMarkup;

  InputMessageContent inputMessageContent;
}
