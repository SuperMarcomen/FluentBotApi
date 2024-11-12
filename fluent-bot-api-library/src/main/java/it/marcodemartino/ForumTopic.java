package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ForumTopic {
  Integer messageThreadId;

  String name;

  Integer iconColor;

  String iconCustomEmojiId;
}
