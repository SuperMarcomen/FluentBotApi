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
public final class InlineQueryResultDocument extends InlineQueryResult {
  String type;

  String id;

  String title;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  String documentUrl;

  String mimeType;

  String description;

  InlineKeyboardMarkup replyMarkup;

  InputMessageContent inputMessageContent;

  String thumbnailUrl;

  Integer thumbnailWidth;

  Integer thumbnailHeight;
}
