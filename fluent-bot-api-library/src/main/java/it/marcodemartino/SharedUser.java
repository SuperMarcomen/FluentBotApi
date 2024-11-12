package it.marcodemartino;

import java.util.List;

public record SharedUser(Integer userId, String firstName, String lastName, String username,
    List<PhotoSize> photo) {
}
