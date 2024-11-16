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
public final class Game {
  @SerializedName("title")
  String title;

  @SerializedName("description")
  String description;

  @SerializedName("photo")
  List<PhotoSize> photo;

  @SerializedName("text")
  String text;

  @SerializedName("text_entities")
  List<MessageEntity> textEntities;

  @SerializedName("animation")
  Animation animation;
}
