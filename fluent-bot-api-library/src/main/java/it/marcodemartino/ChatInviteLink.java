package it.marcodemartino;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ChatInviteLink {
  String inviteLink;

  User creator;

  Boolean createsJoinRequest;

  Boolean isPrimary;

  Boolean isRevoked;

  String name;

  Integer expireDate;

  Integer memberLimit;

  Integer pendingJoinRequestCount;

  Integer subscriptionPeriod;

  Integer subscriptionPrice;
}
