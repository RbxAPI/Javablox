package io.github.rbxapi.javablox.api.presence;

public interface UserPresence {

    /**
     * https://presence.roblox.com/docs#!/Presence/post_v1_presence_users
     * @param userPresenceRequest User IDs
     * @return User Presences
     */
    String getUsersPresences(String userPresenceRequest);
}
