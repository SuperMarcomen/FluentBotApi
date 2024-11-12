package it.marcodemartino;

import java.util.List;

public record BusinessMessagesDeleted(String businessConnectionId, Chat chat,
    List<Integer> messageIds) {
}
