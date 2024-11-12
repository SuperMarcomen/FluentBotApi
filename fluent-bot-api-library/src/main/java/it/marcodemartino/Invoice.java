package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class Invoice {
  String title;

  String description;

  String startParameter;

  String currency;

  Integer totalAmount;
}
