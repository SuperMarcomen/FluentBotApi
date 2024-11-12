package it.marcodemartino;

import java.util.List;

public record UserProfilePhotos(Integer totalCount, List<List<PhotoSize>> photos) {
}
