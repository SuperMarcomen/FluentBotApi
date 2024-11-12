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
public final class InputTextMessageContent extends InputMessageContent {
  String messageText;

  String parseMode;

  List<MessageEntity> entities;

  LinkPreviewOptions linkPreviewOptions;
}
