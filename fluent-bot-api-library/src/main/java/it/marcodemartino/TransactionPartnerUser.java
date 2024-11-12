package it.marcodemartino;

import java.util.List;

public final class TransactionPartnerUser extends TransactionPartner {
  String type;

  User user;

  String invoicePayload;

  List<PaidMedia> paidMedia;

  String paidMediaPayload;
}
