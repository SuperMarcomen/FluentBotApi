package it.marcodemartino.fluentbotapi.entities;

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
public final class ExternalReplyInfo {
  @SerializedName("origin")
  MessageOrigin origin;

  @SerializedName("chat")
  Chat chat;

  @SerializedName("message_id")
  long messageId;

  @SerializedName("link_preview_options")
  LinkPreviewOptions linkPreviewOptions;

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

  @SerializedName("has_media_spoiler")
  Boolean hasMediaSpoiler;

  @SerializedName("contact")
  Contact contact;

  @SerializedName("dice")
  Dice dice;

  @SerializedName("game")
  Game game;

  @SerializedName("giveaway")
  Giveaway giveaway;

  @SerializedName("giveaway_winners")
  GiveawayWinners giveawayWinners;

  @SerializedName("invoice")
  Invoice invoice;

  @SerializedName("location")
  Location location;

  @SerializedName("poll")
  Poll poll;

  @SerializedName("venue")
  Venue venue;
}
