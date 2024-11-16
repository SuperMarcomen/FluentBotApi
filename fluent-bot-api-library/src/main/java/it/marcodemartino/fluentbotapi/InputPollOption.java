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
public final class InputPollOption {
  @SerializedName("text")
  String text;

  @SerializedName("text_parse_mode")
  String textParseMode;

  @SerializedName("text_entities")
  List<MessageEntity> textEntities;
}
