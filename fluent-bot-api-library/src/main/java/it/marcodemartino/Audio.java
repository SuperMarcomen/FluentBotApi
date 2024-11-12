package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class Audio {
  String fileId;

  String fileUniqueId;

  Integer duration;

  String performer;

  String title;

  String fileName;

  String mimeType;

  Integer fileSize;

  PhotoSize thumbnail;
}
