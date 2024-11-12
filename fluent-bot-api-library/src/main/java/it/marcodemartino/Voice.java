package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class Voice {
  String fileId;

  String fileUniqueId;

  Integer duration;

  String mimeType;

  Integer fileSize;
}
