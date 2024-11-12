package it.marcodemartino;

public record User(Integer id, Boolean isBot, String firstName, String lastName, String username,
    String languageCode, Boolean isPremium, Boolean addedToAttachmentMenu, Boolean canJoinGroups,
    Boolean canReadAllGroupMessages, Boolean supportsInlineQueries, Boolean canConnectToBusiness,
    Boolean hasMainWebApp) {
}
