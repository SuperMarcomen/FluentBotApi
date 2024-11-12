package it.marcodemartino;

import java.util.List;

public record Game(String title, String description, List<PhotoSize> photo, String text,
    List<MessageEntity> textEntities, Animation animation) {
}
