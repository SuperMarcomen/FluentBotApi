package it.marcodemartino.fluentbotapi;

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
public final class EncryptedPassportElement {
  @SerializedName("type")
  String type;

  @SerializedName("data")
  String data;

  @SerializedName("phone_number")
  String phoneNumber;

  @SerializedName("email")
  String email;

  @SerializedName("files")
  List<PassportFile> files;

  @SerializedName("front_side")
  PassportFile frontSide;

  @SerializedName("reverse_side")
  PassportFile reverseSide;

  @SerializedName("selfie")
  PassportFile selfie;

  @SerializedName("translation")
  List<PassportFile> translation;

  @SerializedName("hash")
  String hash;
}
