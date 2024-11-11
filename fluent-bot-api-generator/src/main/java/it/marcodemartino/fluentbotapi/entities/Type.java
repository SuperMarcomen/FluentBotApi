package it.marcodemartino.fluentbotapi.entities;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record Type (
    String name,
    String href,
    List<String> description,
    List<Field> fields,
    List<String> subtypes,
    @SerializedName("subtype_of")
    List<String> subtypeOf
) {

}
