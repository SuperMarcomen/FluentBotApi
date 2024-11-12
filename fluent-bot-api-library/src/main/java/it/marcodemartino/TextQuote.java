package it.marcodemartino;

import java.util.List;

public record TextQuote(String text, List<MessageEntity> entities, Integer position,
    Boolean isManual) {
}
