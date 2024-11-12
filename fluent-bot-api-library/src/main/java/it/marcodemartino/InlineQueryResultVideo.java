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
public final class InlineQueryResultVideo extends InlineQueryResult {
  String type;

  String id;

  String videoUrl;

  String mimeType;

  String thumbnailUrl;

  String title;

  String caption;

  String parseMode;

  List<MessageEntity> captionEntities;

  Boolean showCaptionAboveMedia;

  Integer videoWidth;

  Integer videoHeight;

  Integer videoDuration;

  String description;

  InlineKeyboardMarkup replyMarkup;

  InputMessageContent inputMessageContent;
}
