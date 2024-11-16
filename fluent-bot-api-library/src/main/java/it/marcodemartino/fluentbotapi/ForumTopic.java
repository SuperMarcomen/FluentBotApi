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
public final class ForumTopic {
  @SerializedName("message_thread_id")
  long messageThreadId;

  @SerializedName("name")
  String name;

  @SerializedName("icon_color")
  long iconColor;

  @SerializedName("icon_custom_emoji_id")
  String iconCustomEmojiId;
}
