package it.marcodemartino;

public record Update(Integer updateId, Message message, Message editedMessage, Message channelPost,
    Message editedChannelPost, BusinessConnection businessConnection, Message businessMessage,
    Message editedBusinessMessage, BusinessMessagesDeleted deletedBusinessMessages,
    MessageReactionUpdated messageReaction, MessageReactionCountUpdated messageReactionCount,
    InlineQuery inlineQuery, ChosenInlineResult chosenInlineResult, CallbackQuery callbackQuery,
    ShippingQuery shippingQuery, PreCheckoutQuery preCheckoutQuery,
    PaidMediaPurchased purchasedPaidMedia, Poll poll, PollAnswer pollAnswer,
    ChatMemberUpdated myChatMember, ChatMemberUpdated chatMember, ChatJoinRequest chatJoinRequest,
    ChatBoostUpdated chatBoost, ChatBoostRemoved removedChatBoost) {
}
