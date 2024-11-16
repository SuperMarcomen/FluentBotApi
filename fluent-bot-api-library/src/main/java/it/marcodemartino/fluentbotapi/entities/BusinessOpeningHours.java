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
public final class BusinessOpeningHours {
  @SerializedName("time_zone_name")
  String timeZoneName;

  @SerializedName("opening_hours")
  List<BusinessOpeningHoursInterval> openingHours;
}
