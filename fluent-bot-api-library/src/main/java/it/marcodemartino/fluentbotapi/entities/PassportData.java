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
public final class PassportData {
  @SerializedName("data")
  List<EncryptedPassportElement> data;

  @SerializedName("credentials")
  EncryptedCredentials credentials;
}
