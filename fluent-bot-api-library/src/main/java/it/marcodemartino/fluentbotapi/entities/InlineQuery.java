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
public final class InlineQuery {
  @SerializedName("id")
  String id;

  @SerializedName("from")
  User from;

  @SerializedName("query")
  String query;

  @SerializedName("offset")
  String offset;

  @SerializedName("chat_type")
  String chatType;

  @SerializedName("location")
  Location location;
}
