package it.marcodemartino;

public record SwitchInlineQueryChosenChat(String query, Boolean allowUserChats,
    Boolean allowBotChats, Boolean allowGroupChats, Boolean allowChannelChats) {
}
