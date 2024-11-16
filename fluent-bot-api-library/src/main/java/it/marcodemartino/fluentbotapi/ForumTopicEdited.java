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
public final class ForumTopicEdited {
  @SerializedName("name")
  String name;

  @SerializedName("icon_custom_emoji_id")
  String iconCustomEmojiId;
}
