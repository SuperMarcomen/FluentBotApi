package it.marcodemartino;

public record LinkPreviewOptions(Boolean isDisabled, String url, Boolean preferSmallMedia,
    Boolean preferLargeMedia, Boolean showAboveText) {
}
