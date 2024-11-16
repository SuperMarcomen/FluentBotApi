package it.marcodemartino.fluentbotapi.entities;

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
public final class TextQuote {
  @SerializedName("text")
  String text;

  @SerializedName("entities")
  List<MessageEntity> entities;

  @SerializedName("position")
  long position;

  @SerializedName("is_manual")
  Boolean isManual;
}
