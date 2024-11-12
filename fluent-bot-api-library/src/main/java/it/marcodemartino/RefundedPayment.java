package it.marcodemartino;

public record RefundedPayment(String currency, Integer totalAmount, String invoicePayload,
    String telegramPaymentChargeId, String providerPaymentChargeId) {
}
