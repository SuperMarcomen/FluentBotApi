package it.marcodemartino;

public record KeyboardButtonRequestChat(Integer requestId, Boolean chatIsChannel,
    Boolean chatIsForum, Boolean chatHasUsername, Boolean chatIsCreated,
    ChatAdministratorRights userAdministratorRights, ChatAdministratorRights botAdministratorRights,
    Boolean botIsMember, Boolean requestTitle, Boolean requestUsername, Boolean requestPhoto) {
}
