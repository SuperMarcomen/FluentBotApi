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
public final class MessageEntity {
  @SerializedName("type")
  String type;

  @SerializedName("offset")
  long offset;

  @SerializedName("length")
  long length;

  @SerializedName("url")
  String url;

  @SerializedName("user")
  User user;

  @SerializedName("language")
  String language;

  @SerializedName("custom_emoji_id")
  String customEmojiId;
}
