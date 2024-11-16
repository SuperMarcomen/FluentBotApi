package it.marcodemartino.fluentbotapi;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class BusinessIntro {
  @SerializedName("title")
  String title;

  @SerializedName("message")
  String message;

  @SerializedName("sticker")
  Sticker sticker;
}
