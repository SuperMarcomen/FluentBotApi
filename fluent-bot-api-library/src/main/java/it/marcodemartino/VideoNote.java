package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class VideoNote {
  String fileId;

  String fileUniqueId;

  Integer length;

  Integer duration;

  PhotoSize thumbnail;

  Integer fileSize;
}
