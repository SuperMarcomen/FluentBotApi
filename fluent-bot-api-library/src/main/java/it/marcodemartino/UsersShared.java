package it.marcodemartino;

import java.util.List;

public record UsersShared(Integer requestId, List<SharedUser> users) {
}
