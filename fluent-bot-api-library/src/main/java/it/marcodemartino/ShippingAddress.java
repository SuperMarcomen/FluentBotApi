package it.marcodemartino;

public record ShippingAddress(String countryCode, String state, String city, String streetLine1,
    String streetLine2, String postCode) {
}
