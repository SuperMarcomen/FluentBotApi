package it.marcodemartino;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
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
