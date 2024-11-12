package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class SwitchInlineQueryChosenChat {
  String query;

  Boolean allowUserChats;

  Boolean allowBotChats;

  Boolean allowGroupChats;

  Boolean allowChannelChats;
}
