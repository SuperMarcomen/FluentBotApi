package it.marcodemartino;

import java.util.List;

public record ChatFullInfo(Integer id, String type, String title, String username, String firstName,
    String lastName, Boolean isForum, Integer accentColorId, Integer maxReactionCount,
    ChatPhoto photo, List<String> activeUsernames, Birthdate birthdate, BusinessIntro businessIntro,
    BusinessLocation businessLocation, BusinessOpeningHours businessOpeningHours, Chat personalChat,
    List<ReactionType> availableReactions, String backgroundCustomEmojiId,
    Integer profileAccentColorId, String profileBackgroundCustomEmojiId,
    String emojiStatusCustomEmojiId, Integer emojiStatusExpirationDate, String bio,
    Boolean hasPrivateForwards, Boolean hasRestrictedVoiceAndVideoMessages,
    Boolean joinToSendMessages, Boolean joinByRequest, String description, String inviteLink,
    Message pinnedMessage, ChatPermissions permissions, Boolean canSendPaidMedia,
    Integer slowModeDelay, Integer unrestrictBoostCount, Integer messageAutoDeleteTime,
    Boolean hasAggressiveAntiSpamEnabled, Boolean hasHiddenMembers, Boolean hasProtectedContent,
    Boolean hasVisibleHistory, String stickerSetName, Boolean canSetStickerSet,
    String customEmojiStickerSetName, Integer linkedChatId, ChatLocation location) {
}
