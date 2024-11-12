package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class File {
  String fileId;

  String fileUniqueId;

  Integer fileSize;

  String filePath;
}
