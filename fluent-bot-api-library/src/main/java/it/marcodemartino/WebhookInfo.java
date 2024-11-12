package it.marcodemartino;

import java.util.List;

public record WebhookInfo(String url, Boolean hasCustomCertificate, Integer pendingUpdateCount,
    String ipAddress, Integer lastErrorDate, String lastErrorMessage,
    Integer lastSynchronizationErrorDate, Integer maxConnections, List<String> allowedUpdates) {
}
