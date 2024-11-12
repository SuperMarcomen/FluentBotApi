package it.marcodemartino;

public record OrderInfo(String name, String phoneNumber, String email,
    ShippingAddress shippingAddress) {
}
