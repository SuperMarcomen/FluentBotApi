package it.marcodemartino;

import java.util.List;

public final class InputTextMessageContent extends InputMessageContent {
  String messageText;

  String parseMode;

  List<MessageEntity> entities;

  LinkPreviewOptions linkPreviewOptions;
}
