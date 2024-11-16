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
public final class Chat {
  @SerializedName("id")
  long id;

  @SerializedName("type")
  String type;

  @SerializedName("title")
  String title;

  @SerializedName("username")
  String username;

  @SerializedName("first_name")
  String firstName;

  @SerializedName("last_name")
  String lastName;

  @SerializedName("is_forum")
  Boolean isForum;
}
