package it.marcodemartino.fluentbotapi.entities;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class SharedUser {
  @SerializedName("user_id")
  long userId;

  @SerializedName("first_name")
  String firstName;

  @SerializedName("last_name")
  String lastName;

  @SerializedName("username")
  String username;

  @SerializedName("photo")
  List<PhotoSize> photo;
}
