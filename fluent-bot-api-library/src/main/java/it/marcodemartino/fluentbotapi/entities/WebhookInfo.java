package it.marcodemartino.fluentbotapi.entities;

import com.google.gson.annotations.SerializedName;
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
  @SerializedName("url")
  String url;

  @SerializedName("has_custom_certificate")
  Boolean hasCustomCertificate;

  @SerializedName("pending_update_count")
  long pendingUpdateCount;

  @SerializedName("ip_address")
  String ipAddress;

  @SerializedName("last_error_date")
  long lastErrorDate;

  @SerializedName("last_error_message")
  String lastErrorMessage;

  @SerializedName("last_synchronization_error_date")
  long lastSynchronizationErrorDate;

  @SerializedName("max_connections")
  long maxConnections;

  @SerializedName("allowed_updates")
  List<String> allowedUpdates;
}
