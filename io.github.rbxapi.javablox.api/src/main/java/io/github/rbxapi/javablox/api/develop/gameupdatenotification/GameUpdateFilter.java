package io.github.rbxapi.javablox.api.develop.gameupdatenotification;

public interface GameUpdateFilter {

    /**
     * Filters a game update notification
     *
     * @param gameUpdateText Text to filter
     * @return response code
     */
    String filter(String gameUpdateText);
}
