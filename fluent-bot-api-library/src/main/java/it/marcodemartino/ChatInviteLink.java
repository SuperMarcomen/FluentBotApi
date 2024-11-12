package it.marcodemartino;

public record ChatInviteLink(String inviteLink, User creator, Boolean createsJoinRequest,
    Boolean isPrimary, Boolean isRevoked, String name, Integer expireDate, Integer memberLimit,
    Integer pendingJoinRequestCount, Integer subscriptionPeriod, Integer subscriptionPrice) {
}
