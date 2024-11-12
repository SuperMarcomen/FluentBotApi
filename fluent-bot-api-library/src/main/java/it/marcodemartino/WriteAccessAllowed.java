package it.marcodemartino;

public record WriteAccessAllowed(Boolean fromRequest, String webAppName,
    Boolean fromAttachmentMenu) {
}
