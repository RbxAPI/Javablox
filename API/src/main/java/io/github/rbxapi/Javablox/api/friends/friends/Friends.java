package io.github.rbxapi.javablox.api.friends.friends;

public interface Friends {
    /**
     * https://friends.roblox.com/docs#!/Friends/get_v1_users_userId_friends
     * @param userId User ID
     * @return List of friends
     */
    String getFriends(double userId);

    /**
     * https://friends.roblox.com/docs#!/Friends/post_v1_users_targetUserId_unfriend
     * @param targetUserId User ID
     * @return Status code
     */
    String unfriend(double targetUserId);
}
