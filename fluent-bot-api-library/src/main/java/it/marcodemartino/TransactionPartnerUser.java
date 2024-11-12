package it.marcodemartino;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class TransactionPartnerUser extends TransactionPartner {
  String type;

  User user;

  String invoicePayload;

  List<PaidMedia> paidMedia;

  String paidMediaPayload;
}
