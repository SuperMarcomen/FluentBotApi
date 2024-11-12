package it.marcodemartino;

import java.util.List;

public final class InlineQueryResultVoice extends InlineQueryResult {
  String type;

  String id;

  String voiceUrl;

  String title;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  Integer voiceDuration;

  InlineKeyboardMarkup replyMarkup;

  InputMessageContent inputMessageContent;
}
