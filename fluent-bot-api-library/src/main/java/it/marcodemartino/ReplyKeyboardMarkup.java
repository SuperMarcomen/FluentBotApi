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
public final class ReplyKeyboardMarkup {
  List<List<KeyboardButton>> keyboard;

  Boolean isPersistent;

  Boolean resizeKeyboard;

  Boolean oneTimeKeyboard;

  String inputFieldPlaceholder;

  Boolean selective;
}
