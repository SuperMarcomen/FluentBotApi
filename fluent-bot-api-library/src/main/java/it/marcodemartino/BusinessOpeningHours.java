package it.marcodemartino;

import java.util.List;

public record BusinessOpeningHours(String timeZoneName,
    List<BusinessOpeningHoursInterval> openingHours) {
}
