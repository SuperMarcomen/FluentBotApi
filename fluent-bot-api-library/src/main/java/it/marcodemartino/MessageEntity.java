package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class MessageEntity {
  String type;

  Integer offset;

  Integer length;

  String url;

  User user;

  String language;

  String customEmojiId;
}
