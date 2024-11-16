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
public final class ChatShared {
  @SerializedName("request_id")
  long requestId;

  @SerializedName("chat_id")
  long chatId;

  @SerializedName("title")
  String title;

  @SerializedName("username")
  String username;

  @SerializedName("photo")
  List<PhotoSize> photo;
}
