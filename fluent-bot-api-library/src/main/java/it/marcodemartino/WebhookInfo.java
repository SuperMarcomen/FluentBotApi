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
public final class WebhookInfo {
  String url;

  Boolean hasCustomCertificate;

  Integer pendingUpdateCount;

  String ipAddress;

  Integer lastErrorDate;

  String lastErrorMessage;

  Integer lastSynchronizationErrorDate;

  Integer maxConnections;

  List<String> allowedUpdates;
}
