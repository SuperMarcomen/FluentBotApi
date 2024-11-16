package it.marcodemartino.fluentbotapi;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class ChatInviteLink {
  @SerializedName("invite_link")
  String inviteLink;

  @SerializedName("creator")
  User creator;

  @SerializedName("creates_join_request")
  Boolean createsJoinRequest;

  @SerializedName("is_primary")
  Boolean isPrimary;

  @SerializedName("is_revoked")
  Boolean isRevoked;

  @SerializedName("name")
  String name;

  @SerializedName("expire_date")
  long expireDate;

  @SerializedName("member_limit")
  long memberLimit;

  @SerializedName("pending_join_request_count")
  long pendingJoinRequestCount;

  @SerializedName("subscription_period")
  long subscriptionPeriod;

  @SerializedName("subscription_price")
  long subscriptionPrice;
}
