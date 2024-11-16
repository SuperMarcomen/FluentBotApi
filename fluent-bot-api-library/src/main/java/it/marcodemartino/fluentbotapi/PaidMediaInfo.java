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
public final class PaidMediaInfo {
  @SerializedName("star_count")
  long starCount;

  @SerializedName("paid_media")
  List<PaidMedia> paidMedia;
}
