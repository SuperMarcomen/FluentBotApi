package it.marcodemartino;

public record SuccessfulPayment(String currency, Integer totalAmount, String invoicePayload,
    String shippingOptionId, OrderInfo orderInfo, String telegramPaymentChargeId,
    String providerPaymentChargeId) {
}
