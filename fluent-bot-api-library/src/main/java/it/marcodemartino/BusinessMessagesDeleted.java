package it.marcodemartino;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class BusinessMessagesDeleted {
  String businessConnectionId;

  Chat chat;

  List<Integer> messageIds;
}
