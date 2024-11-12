package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InlineQueryResultArticle extends InlineQueryResult {
  String type;

  String id;

  String title;

  InputMessageContent inputMessageContent;

  InlineKeyboardMarkup replyMarkup;

  String url;

  Boolean hideUrl;

  String description;

  String thumbnailUrl;

  Integer thumbnailWidth;

  Integer thumbnailHeight;
}
