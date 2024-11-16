package it.marcodemartino.fluentbotapi;

import com.google.gson.annotations.SerializedName;
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
  @SerializedName("keyboard")
  List<List<KeyboardButton>> keyboard;

  @SerializedName("is_persistent")
  Boolean isPersistent;

  @SerializedName("resize_keyboard")
  Boolean resizeKeyboard;

  @SerializedName("one_time_keyboard")
  Boolean oneTimeKeyboard;

  @SerializedName("input_field_placeholder")
  String inputFieldPlaceholder;

  @SerializedName("selective")
  Boolean selective;
}
