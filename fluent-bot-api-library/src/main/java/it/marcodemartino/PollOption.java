package it.marcodemartino;

import java.util.List;

public record PollOption(String text, List<MessageEntity> textEntities, Integer voterCount) {
}
