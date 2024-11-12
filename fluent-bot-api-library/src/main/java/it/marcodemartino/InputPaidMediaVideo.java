package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InputPaidMediaVideo extends InputPaidMedia {
  String type;

  String media;

  InputFile thumbnail;

  Integer width;

  Integer height;

  Integer duration;

  Boolean supportsStreaming;
}
