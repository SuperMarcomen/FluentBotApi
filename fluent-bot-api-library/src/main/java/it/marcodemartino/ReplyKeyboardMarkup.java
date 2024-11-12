package it.marcodemartino;

import java.util.List;

public record ReplyKeyboardMarkup(List<List<KeyboardButton>> keyboard, Boolean isPersistent,
    Boolean resizeKeyboard, Boolean oneTimeKeyboard, String inputFieldPlaceholder,
    Boolean selective) {
}
