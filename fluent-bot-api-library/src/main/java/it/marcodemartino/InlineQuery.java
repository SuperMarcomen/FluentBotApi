package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class InlineQuery {
  String id;

  User from;

  String query;

  String offset;

  String chatType;

  Location location;
}
