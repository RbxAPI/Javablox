package io.github.rbxapi.javablox.api.following;

public interface UserFollowing {

    /**
     * https://followings.roblox.com/docs#!/Users/get_v1_users_userId_universes
     *
     * @param userId User ID
     * @return JSON
     */
    String getAllFollowings(double userId);

    /**
     * https://followings.roblox.com/docs#!/Users/get_v1_users_userId_universes_universeId_status
     *
     * @param userId     User ID
     * @param universeId Universe ID
     * @return Status code
     */
    String getFollowingStatus(double userId, double universeId);

    /**
     * https://followings.roblox.com/docs#!/Users/delete_v1_users_userId_universes_universeId
     *
     * @param userId     User ID
     * @param universeId Universe ID
     * @return Status Code
     */
    String deleteFollowing(double userId, double universeId);

    /**
     * https://followings.roblox.com/docs#!/Users/post_v1_users_userId_universes_universeId
     *
     * @param userId     User ID
     * @param universeId Universe ID
     * @return Status Code
     */
    String createFollowing(double userId, double universeId);
}
