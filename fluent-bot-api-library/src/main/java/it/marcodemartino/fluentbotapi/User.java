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
public final class User {
  @SerializedName("id")
  long id;

  @SerializedName("is_bot")
  Boolean isBot;

  @SerializedName("first_name")
  String firstName;

  @SerializedName("last_name")
  String lastName;

  @SerializedName("username")
  String username;

  @SerializedName("language_code")
  String languageCode;

  @SerializedName("is_premium")
  Boolean isPremium;

  @SerializedName("added_to_attachment_menu")
  Boolean addedToAttachmentMenu;

  @SerializedName("can_join_groups")
  Boolean canJoinGroups;

  @SerializedName("can_read_all_group_messages")
  Boolean canReadAllGroupMessages;

  @SerializedName("supports_inline_queries")
  Boolean supportsInlineQueries;

  @SerializedName("can_connect_to_business")
  Boolean canConnectToBusiness;

  @SerializedName("has_main_web_app")
  Boolean hasMainWebApp;
}
