package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class Animation {
  String fileId;

  String fileUniqueId;

  Integer width;

  Integer height;

  Integer duration;

  PhotoSize thumbnail;

  String fileName;

  String mimeType;

  Integer fileSize;
}
