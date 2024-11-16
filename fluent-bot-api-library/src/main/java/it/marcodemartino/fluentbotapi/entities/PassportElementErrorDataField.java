package it.marcodemartino.fluentbotapi.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class PassportElementErrorDataField {
  @SerializedName("source")
  String source;

  @SerializedName("type")
  String type;

  @SerializedName("field_name")
  String fieldName;

  @SerializedName("data_hash")
  String dataHash;

  @SerializedName("message")
  String message;
}
