package it.marcodemartino.fluentbotapi.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InlineQueryResultGame {
  @SerializedName("type")
  String type;

  @SerializedName("id")
  String id;

  @SerializedName("game_short_name")
  String gameShortName;

  @SerializedName("reply_markup")
  InlineKeyboardMarkup replyMarkup;
}
