package it.marcodemartino;

public record ProximityAlertTriggered(User traveler, User watcher, Integer distance) {
}
