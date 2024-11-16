package it.marcodemartino.fluentbotapi;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class EncryptedCredentials {
  @SerializedName("data")
  String data;

  @SerializedName("hash")
  String hash;

  @SerializedName("secret")
  String secret;
}
