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
public final class InlineQueryResultCachedSticker {
  @SerializedName("type")
  String type;

  @SerializedName("id")
  String id;

  @SerializedName("sticker_file_id")
  String stickerFileId;

  @SerializedName("reply_markup")
  InlineKeyboardMarkup replyMarkup;

  @SerializedName("input_message_content")
  InputMessageContent inputMessageContent;
}
