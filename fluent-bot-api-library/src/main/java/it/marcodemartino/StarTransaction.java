package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class StarTransaction {
  String id;

  Integer amount;

  Integer date;

  TransactionPartner source;

  TransactionPartner receiver;
}
