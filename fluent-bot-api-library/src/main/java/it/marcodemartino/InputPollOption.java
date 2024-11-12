package it.marcodemartino;

import java.util.List;

public record InputPollOption(String text, String textParseMode, List<MessageEntity> textEntities) {
}
