package it.marcodemartino;

public record PreCheckoutQuery(String id, User from, String currency, Integer totalAmount,
    String invoicePayload, String shippingOptionId, OrderInfo orderInfo) {
}
