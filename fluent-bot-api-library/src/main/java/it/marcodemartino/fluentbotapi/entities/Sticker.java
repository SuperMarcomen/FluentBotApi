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
public final class Sticker {
  @SerializedName("file_id")
  String fileId;

  @SerializedName("file_unique_id")
  String fileUniqueId;

  @SerializedName("type")
  String type;

  @SerializedName("width")
  long width;

  @SerializedName("height")
  long height;

  @SerializedName("is_animated")
  Boolean isAnimated;

  @SerializedName("is_video")
  Boolean isVideo;

  @SerializedName("thumbnail")
  PhotoSize thumbnail;

  @SerializedName("emoji")
  String emoji;

  @SerializedName("set_name")
  String setName;

  @SerializedName("premium_animation")
  File premiumAnimation;

  @SerializedName("mask_position")
  MaskPosition maskPosition;

  @SerializedName("custom_emoji_id")
  String customEmojiId;

  @SerializedName("needs_repainting")
  Boolean needsRepainting;

  @SerializedName("file_size")
  long fileSize;
}
