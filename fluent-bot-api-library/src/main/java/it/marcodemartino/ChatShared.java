package it.marcodemartino;

import java.util.List;

public record ChatShared(Integer requestId, Integer chatId, String title, String username,
    List<PhotoSize> photo) {
}
