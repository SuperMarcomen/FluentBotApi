package it.marcodemartino;

import java.util.List;

public final class Message extends MaybeInaccessibleMessage {
  Integer messageId;

  Integer messageThreadId;

  User from;

  Chat senderChat;

  Integer senderBoostCount;

  User senderBusinessBot;

  Integer date;

  String businessConnectionId;

  Chat chat;

  MessageOrigin forwardOrigin;

  Boolean isTopicMessage;

  Boolean isAutomaticForward;

  Message replyToMessage;

  ExternalReplyInfo externalReply;

  TextQuote quote;

  Story replyToStory;

  User viaBot;

  Integer editDate;

  Boolean hasProtectedContent;

  Boolean isFromOffline;

  String mediaGroupId;

  String authorSignature;

  String text;

  List<MessageEntity> entities;

  LinkPreviewOptions linkPreviewOptions;

  String effectId;

  Animation animation;

  Audio audio;

  Document document;

  PaidMediaInfo paidMedia;

  List<PhotoSize> photo;

  Sticker sticker;

  Story story;

  Video video;

  VideoNote videoNote;

  Voice voice;

  String caption;

  List<MessageEntity> captionEntities;

  Boolean showCaptionAboveMedia;

  Boolean hasMediaSpoiler;

  Contact contact;

  Dice dice;

  Game game;

  Poll poll;

  Venue venue;

  Location location;

  List<User> newChatMembers;

  User leftChatMember;

  String newChatTitle;

  List<PhotoSize> newChatPhoto;

  Boolean deleteChatPhoto;

  Boolean groupChatCreated;

  Boolean supergroupChatCreated;

  Boolean channelChatCreated;

  MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;

  Integer migrateToChatId;

  Integer migrateFromChatId;

  MaybeInaccessibleMessage pinnedMessage;

  Invoice invoice;

  SuccessfulPayment successfulPayment;

  RefundedPayment refundedPayment;

  UsersShared usersShared;

  ChatShared chatShared;

  String connectedWebsite;

  WriteAccessAllowed writeAccessAllowed;

  PassportData passportData;

  ProximityAlertTriggered proximityAlertTriggered;

  ChatBoostAdded boostAdded;

  ChatBackground chatBackgroundSet;

  ForumTopicCreated forumTopicCreated;

  ForumTopicEdited forumTopicEdited;

  ForumTopicClosed forumTopicClosed;

  ForumTopicReopened forumTopicReopened;

  GeneralForumTopicHidden generalForumTopicHidden;

  GeneralForumTopicUnhidden generalForumTopicUnhidden;

  GiveawayCreated giveawayCreated;

  Giveaway giveaway;

  GiveawayWinners giveawayWinners;

  GiveawayCompleted giveawayCompleted;

  VideoChatScheduled videoChatScheduled;

  VideoChatStarted videoChatStarted;

  VideoChatEnded videoChatEnded;

  VideoChatParticipantsInvited videoChatParticipantsInvited;

  WebAppData webAppData;

  InlineKeyboardMarkup replyMarkup;
}
