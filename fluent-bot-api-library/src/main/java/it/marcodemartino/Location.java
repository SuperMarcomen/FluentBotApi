package it.marcodemartino;

public record Location(Float latitude, Float longitude, Float horizontalAccuracy,
    Integer livePeriod, Integer heading, Integer proximityAlertRadius) {
}
