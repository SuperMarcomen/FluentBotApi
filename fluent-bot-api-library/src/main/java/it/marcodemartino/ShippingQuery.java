package it.marcodemartino;

public record ShippingQuery(String id, User from, String invoicePayload,
    ShippingAddress shippingAddress) {
}
