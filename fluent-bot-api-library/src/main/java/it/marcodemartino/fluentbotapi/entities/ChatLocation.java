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
public final class ChatLocation {
  @SerializedName("location")
  Location location;

  @SerializedName("address")
  String address;
}
