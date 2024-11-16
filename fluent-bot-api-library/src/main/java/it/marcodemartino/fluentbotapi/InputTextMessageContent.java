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
public final class InputTextMessageContent {
  @SerializedName("message_text")
  String messageText;

  @SerializedName("parse_mode")
  String parseMode;

  @SerializedName("entities")
  List<MessageEntity> entities;

  @SerializedName("link_preview_options")
  LinkPreviewOptions linkPreviewOptions;
}
