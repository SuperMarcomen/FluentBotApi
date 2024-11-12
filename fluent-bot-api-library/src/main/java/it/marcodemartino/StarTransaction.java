package it.marcodemartino;

public record StarTransaction(String id, Integer amount, Integer date, TransactionPartner source,
    TransactionPartner receiver) {
}
