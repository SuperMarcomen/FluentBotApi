package it.marcodemartino;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class PassportElementErrorTranslationFiles extends PassportElementError {
  String source;

  String type;

  List<String> fileHashes;

  String message;
}
