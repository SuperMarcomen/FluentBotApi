package it.marcodemartino.fluentbotapi;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class WriteAccessAllowed {
  @SerializedName("from_request")
  Boolean fromRequest;

  @SerializedName("web_app_name")
  String webAppName;

  @SerializedName("from_attachment_menu")
  Boolean fromAttachmentMenu;
}
