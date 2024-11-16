package it.marcodemartino.fluentbotapi;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class Message {
  @SerializedName("message_id")
  long messageId;

  @SerializedName("message_thread_id")
  long messageThreadId;

  @SerializedName("from")
  User from;

  @SerializedName("sender_chat")
  Chat senderChat;

  @SerializedName("sender_boost_count")
  long senderBoostCount;

  @SerializedName("sender_business_bot")
  User senderBusinessBot;

  @SerializedName("date")
  long date;

  @SerializedName("business_connection_id")
  String businessConnectionId;

  @SerializedName("chat")
  Chat chat;

  @SerializedName("forward_origin")
  MessageOrigin forwardOrigin;

  @SerializedName("is_topic_message")
  Boolean isTopicMessage;

  @SerializedName("is_automatic_forward")
  Boolean isAutomaticForward;

  @SerializedName("reply_to_message")
  Message replyToMessage;

  @SerializedName("external_reply")
  ExternalReplyInfo externalReply;

  @SerializedName("quote")
  TextQuote quote;

  @SerializedName("reply_to_story")
  Story replyToStory;

  @SerializedName("via_bot")
  User viaBot;

  @SerializedName("edit_date")
  long editDate;

  @SerializedName("has_protected_content")
  Boolean hasProtectedContent;

  @SerializedName("is_from_offline")
  Boolean isFromOffline;

  @SerializedName("media_group_id")
  String mediaGroupId;

  @SerializedName("author_signature")
  String authorSignature;

  @SerializedName("text")
  String text;

  @SerializedName("entities")
  List<MessageEntity> entities;

  @SerializedName("link_preview_options")
  LinkPreviewOptions linkPreviewOptions;

  @SerializedName("effect_id")
  String effectId;

  @SerializedName("animation")
  Animation animation;

  @SerializedName("audio")
  Audio audio;

  @SerializedName("document")
  Document document;

  @SerializedName("paid_media")
  PaidMediaInfo paidMedia;

  @SerializedName("photo")
  List<PhotoSize> photo;

  @SerializedName("sticker")
  Sticker sticker;

  @SerializedName("story")
  Story story;

  @SerializedName("video")
  Video video;

  @SerializedName("video_note")
  VideoNote videoNote;

  @SerializedName("voice")
  Voice voice;

  @SerializedName("caption")
  String caption;

  @SerializedName("caption_entities")
  List<MessageEntity> captionEntities;

  @SerializedName("show_caption_above_media")
  Boolean showCaptionAboveMedia;

  @SerializedName("has_media_spoiler")
  Boolean hasMediaSpoiler;

  @SerializedName("contact")
  Contact contact;

  @SerializedName("dice")
  Dice dice;

  @SerializedName("game")
  Game game;

  @SerializedName("poll")
  Poll poll;

  @SerializedName("venue")
  Venue venue;

  @SerializedName("location")
  Location location;

  @SerializedName("new_chat_members")
  List<User> newChatMembers;

  @SerializedName("left_chat_member")
  User leftChatMember;

  @SerializedName("new_chat_title")
  String newChatTitle;

  @SerializedName("new_chat_photo")
  List<PhotoSize> newChatPhoto;

  @SerializedName("delete_chat_photo")
  Boolean deleteChatPhoto;

  @SerializedName("group_chat_created")
  Boolean groupChatCreated;

  @SerializedName("supergroup_chat_created")
  Boolean supergroupChatCreated;

  @SerializedName("channel_chat_created")
  Boolean channelChatCreated;

  @SerializedName("message_auto_delete_timer_changed")
  MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;

  @SerializedName("migrate_to_chat_id")
  long migrateToChatId;

  @SerializedName("migrate_from_chat_id")
  long migrateFromChatId;

  @SerializedName("pinned_message")
  MaybeInaccessibleMessage pinnedMessage;

  @SerializedName("invoice")
  Invoice invoice;

  @SerializedName("successful_payment")
  SuccessfulPayment successfulPayment;

  @SerializedName("refunded_payment")
  RefundedPayment refundedPayment;

  @SerializedName("users_shared")
  UsersShared usersShared;

  @SerializedName("chat_shared")
  ChatShared chatShared;

  @SerializedName("connected_website")
  String connectedWebsite;

  @SerializedName("write_access_allowed")
  WriteAccessAllowed writeAccessAllowed;

  @SerializedName("passport_data")
  PassportData passportData;

  @SerializedName("proximity_alert_triggered")
  ProximityAlertTriggered proximityAlertTriggered;

  @SerializedName("boost_added")
  ChatBoostAdded boostAdded;

  @SerializedName("chat_background_set")
  ChatBackground chatBackgroundSet;

  @SerializedName("forum_topic_created")
  ForumTopicCreated forumTopicCreated;

  @SerializedName("forum_topic_edited")
  ForumTopicEdited forumTopicEdited;

  @SerializedName("forum_topic_closed")
  ForumTopicClosed forumTopicClosed;

  @SerializedName("forum_topic_reopened")
  ForumTopicReopened forumTopicReopened;

  @SerializedName("general_forum_topic_hidden")
  GeneralForumTopicHidden generalForumTopicHidden;

  @SerializedName("general_forum_topic_unhidden")
  GeneralForumTopicUnhidden generalForumTopicUnhidden;

  @SerializedName("giveaway_created")
  GiveawayCreated giveawayCreated;

  @SerializedName("giveaway")
  Giveaway giveaway;

  @SerializedName("giveaway_winners")
  GiveawayWinners giveawayWinners;

  @SerializedName("giveaway_completed")
  GiveawayCompleted giveawayCompleted;

  @SerializedName("video_chat_scheduled")
  VideoChatScheduled videoChatScheduled;

  @SerializedName("video_chat_started")
  VideoChatStarted videoChatStarted;

  @SerializedName("video_chat_ended")
  VideoChatEnded videoChatEnded;

  @SerializedName("video_chat_participants_invited")
  VideoChatParticipantsInvited videoChatParticipantsInvited;

  @SerializedName("web_app_data")
  WebAppData webAppData;

  @SerializedName("reply_markup")
  InlineKeyboardMarkup replyMarkup;
}
