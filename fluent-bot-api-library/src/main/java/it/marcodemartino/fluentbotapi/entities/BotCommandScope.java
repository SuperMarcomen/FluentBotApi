package it.marcodemartino.fluentbotapi.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(
    fluent = true
)
public final class BotCommandScope {
  @SerializedName("type")
  String type;

  BotCommandScopeContent botCommandScopeContent;
}
