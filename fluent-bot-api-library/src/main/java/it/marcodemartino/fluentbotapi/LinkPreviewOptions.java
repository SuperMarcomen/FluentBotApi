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
public final class LinkPreviewOptions {
  @SerializedName("is_disabled")
  Boolean isDisabled;

  @SerializedName("url")
  String url;

  @SerializedName("prefer_small_media")
  Boolean preferSmallMedia;

  @SerializedName("prefer_large_media")
  Boolean preferLargeMedia;

  @SerializedName("show_above_text")
  Boolean showAboveText;
}
