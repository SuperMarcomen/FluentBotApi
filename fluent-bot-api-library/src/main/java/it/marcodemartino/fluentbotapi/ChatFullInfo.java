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
public final class ChatFullInfo {
  @SerializedName("id")
  long id;

  @SerializedName("type")
  String type;

  @SerializedName("title")
  String title;

  @SerializedName("username")
  String username;

  @SerializedName("first_name")
  String firstName;

  @SerializedName("last_name")
  String lastName;

  @SerializedName("is_forum")
  Boolean isForum;

  @SerializedName("accent_color_id")
  long accentColorId;

  @SerializedName("max_reaction_count")
  long maxReactionCount;

  @SerializedName("photo")
  ChatPhoto photo;

  @SerializedName("active_usernames")
  List<String> activeUsernames;

  @SerializedName("birthdate")
  Birthdate birthdate;

  @SerializedName("business_intro")
  BusinessIntro businessIntro;

  @SerializedName("business_location")
  BusinessLocation businessLocation;

  @SerializedName("business_opening_hours")
  BusinessOpeningHours businessOpeningHours;

  @SerializedName("personal_chat")
  Chat personalChat;

  @SerializedName("available_reactions")
  List<ReactionType> availableReactions;

  @SerializedName("background_custom_emoji_id")
  String backgroundCustomEmojiId;

  @SerializedName("profile_accent_color_id")
  long profileAccentColorId;

  @SerializedName("profile_background_custom_emoji_id")
  String profileBackgroundCustomEmojiId;

  @SerializedName("emoji_status_custom_emoji_id")
  String emojiStatusCustomEmojiId;

  @SerializedName("emoji_status_expiration_date")
  long emojiStatusExpirationDate;

  @SerializedName("bio")
  String bio;

  @SerializedName("has_private_forwards")
  Boolean hasPrivateForwards;

  @SerializedName("has_restricted_voice_and_video_messages")
  Boolean hasRestrictedVoiceAndVideoMessages;

  @SerializedName("join_to_send_messages")
  Boolean joinToSendMessages;

  @SerializedName("join_by_request")
  Boolean joinByRequest;

  @SerializedName("description")
  String description;

  @SerializedName("invite_link")
  String inviteLink;

  @SerializedName("pinned_message")
  Message pinnedMessage;

  @SerializedName("permissions")
  ChatPermissions permissions;

  @SerializedName("can_send_paid_media")
  Boolean canSendPaidMedia;

  @SerializedName("slow_mode_delay")
  long slowModeDelay;

  @SerializedName("unrestrict_boost_count")
  long unrestrictBoostCount;

  @SerializedName("message_auto_delete_time")
  long messageAutoDeleteTime;

  @SerializedName("has_aggressive_anti_spam_enabled")
  Boolean hasAggressiveAntiSpamEnabled;

  @SerializedName("has_hidden_members")
  Boolean hasHiddenMembers;

  @SerializedName("has_protected_content")
  Boolean hasProtectedContent;

  @SerializedName("has_visible_history")
  Boolean hasVisibleHistory;

  @SerializedName("sticker_set_name")
  String stickerSetName;

  @SerializedName("can_set_sticker_set")
  Boolean canSetStickerSet;

  @SerializedName("custom_emoji_sticker_set_name")
  String customEmojiStickerSetName;

  @SerializedName("linked_chat_id")
  long linkedChatId;

  @SerializedName("location")
  ChatLocation location;
}
