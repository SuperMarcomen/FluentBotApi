package it.marcodemartino.fluentbotapi.entities;

import java.util.List;

public record Field(
    String name,
    List<String> types,
    boolean required,
    String description
) {

}
