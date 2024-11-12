package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class Document {
  String fileId;

  String fileUniqueId;

  PhotoSize thumbnail;

  String fileName;

  String mimeType;

  Integer fileSize;
}
