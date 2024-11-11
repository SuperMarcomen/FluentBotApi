package it.marcodemartino.fluentbotapi.entities;

import java.util.List;

public record Method (
    String name,
    String href,
    List<String> description,
    List<String> returns,
    List<Field> fields
) {

}