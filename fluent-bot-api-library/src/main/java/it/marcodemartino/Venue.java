package it.marcodemartino;

public record Venue(Location location, String title, String address, String foursquareId,
    String foursquareType, String googlePlaceId, String googlePlaceType) {
}
