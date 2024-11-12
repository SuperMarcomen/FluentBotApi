package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class LinkPreviewOptions {
  Boolean isDisabled;

  String url;

  Boolean preferSmallMedia;

  Boolean preferLargeMedia;

  Boolean showAboveText;
}
