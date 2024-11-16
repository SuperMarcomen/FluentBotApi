package it.marcodemartino.fluentbotapi.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class Update {
  @SerializedName("update_id")
  long updateId;

  @SerializedName("message")
  Message message;

  @SerializedName("edited_message")
  Message editedMessage;

  @SerializedName("channel_post")
  Message channelPost;

  @SerializedName("edited_channel_post")
  Message editedChannelPost;

  @SerializedName("business_connection")
  BusinessConnection businessConnection;

  @SerializedName("business_message")
  Message businessMessage;

  @SerializedName("edited_business_message")
  Message editedBusinessMessage;

  @SerializedName("deleted_business_messages")
  BusinessMessagesDeleted deletedBusinessMessages;

  @SerializedName("message_reaction")
  MessageReactionUpdated messageReaction;

  @SerializedName("message_reaction_count")
  MessageReactionCountUpdated messageReactionCount;

  @SerializedName("inline_query")
  InlineQuery inlineQuery;

  @SerializedName("chosen_inline_result")
  ChosenInlineResult chosenInlineResult;

  @SerializedName("callback_query")
  CallbackQuery callbackQuery;

  @SerializedName("shipping_query")
  ShippingQuery shippingQuery;

  @SerializedName("pre_checkout_query")
  PreCheckoutQuery preCheckoutQuery;

  @SerializedName("purchased_paid_media")
  PaidMediaPurchased purchasedPaidMedia;

  @SerializedName("poll")
  Poll poll;

  @SerializedName("poll_answer")
  PollAnswer pollAnswer;

  @SerializedName("my_chat_member")
  ChatMemberUpdated myChatMember;

  @SerializedName("chat_member")
  ChatMemberUpdated chatMember;

  @SerializedName("chat_join_request")
  ChatJoinRequest chatJoinRequest;

  @SerializedName("chat_boost")
  ChatBoostUpdated chatBoost;

  @SerializedName("removed_chat_boost")
  ChatBoostRemoved removedChatBoost;
}
