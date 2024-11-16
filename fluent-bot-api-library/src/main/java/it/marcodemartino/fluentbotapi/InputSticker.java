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
public final class InputSticker {
  @SerializedName("sticker")
  InputFile sticker;

  @SerializedName("format")
  String format;

  @SerializedName("emoji_list")
  List<String> emojiList;

  @SerializedName("mask_position")
  MaskPosition maskPosition;

  @SerializedName("keywords")
  List<String> keywords;
}
