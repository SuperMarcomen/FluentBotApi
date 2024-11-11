package it.marcodemartino.fluentbotapi.entities;

import java.util.Map;

public record ApiDetails(
    Map<String, Method> methods,
    Map<String, Type> types
) {

}
