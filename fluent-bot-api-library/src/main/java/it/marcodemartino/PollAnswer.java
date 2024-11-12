package it.marcodemartino;

import java.util.List;

public record PollAnswer(String pollId, Chat voterChat, User user, List<Integer> optionIds) {
}
