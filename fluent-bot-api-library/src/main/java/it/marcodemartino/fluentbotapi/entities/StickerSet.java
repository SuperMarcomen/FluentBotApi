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
public final class StickerSet {
  @SerializedName("name")
  String name;

  @SerializedName("title")
  String title;

  @SerializedName("sticker_type")
  String stickerType;

  @SerializedName("stickers")
  List<Sticker> stickers;

  @SerializedName("thumbnail")
  PhotoSize thumbnail;
}
