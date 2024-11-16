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
public final class UserProfilePhotos {
  @SerializedName("total_count")
  long totalCount;

  @SerializedName("photos")
  List<List<PhotoSize>> photos;
}
