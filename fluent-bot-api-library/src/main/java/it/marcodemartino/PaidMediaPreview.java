package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class PaidMediaPreview extends PaidMedia {
  String type;

  Integer width;

  Integer height;

  Integer duration;
}
