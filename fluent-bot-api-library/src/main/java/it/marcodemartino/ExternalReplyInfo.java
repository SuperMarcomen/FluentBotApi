package it.marcodemartino;

import java.util.List;

public record ExternalReplyInfo(MessageOrigin origin, Chat chat, Integer messageId,
    LinkPreviewOptions linkPreviewOptions, Animation animation, Audio audio, Document document,
    PaidMediaInfo paidMedia, List<PhotoSize> photo, Sticker sticker, Story story, Video video,
    VideoNote videoNote, Voice voice, Boolean hasMediaSpoiler, Contact contact, Dice dice,
    Game game, Giveaway giveaway, GiveawayWinners giveawayWinners, Invoice invoice,
    Location location, Poll poll, Venue venue) {
}
