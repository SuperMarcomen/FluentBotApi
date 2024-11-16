package it.marcodemartino.fluentbotapi.entities;

import java.util.List;

public record Field(
    String name,
    List<String> types,
    boolean required,
    String description
) {

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Field field)) {
      return false;
    }
    return name.equals(field.name) && types.equals(field.types);
  }
}
