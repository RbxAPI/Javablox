package io.github.rbxapi.javablox.api.develop.gameupdatenotification;

public interface GameUpdateNotification {

    /**
     * Gets Game Update Notification
     *
     * @param universeId The universe Id
     * @return Notifications
     */
    String getGameUpdateNotification(String universeId);

    /**
     * Sends a notification signal
     *
     * @param universeId     Universe Id
     * @param gameUpdateText The message to update
     * @return Response code
     */
    String sendGameUpdateNotification(String universeId, String gameUpdateText);
}
