package io.github.rbxapi.javablox.api.friends.friends;

public interface FriendRequests {

    /**
     * https://friends.roblox.com/docs#!/Friends/post_v1_user_friend_requests_decline_all
     *
     * @return Status code
     */
    String declineAll();

    /**
     * https://friends.roblox.com/docs#!/Friends/post_v1_users_requesterUserId_accept_friend_request
     *
     * @param requesterUserId User ID
     * @return Status code
     */
    String accept(double requesterUserId);

    /**
     * https://friends.roblox.com/docs#!/Friends/post_v1_users_requesterUserId_decline_friend_request
     *
     * @param requestUserId User ID
     * @return Status Code
     */
    String decline(double requestUserId);

    /**
     * https://friends.roblox.com/docs#!/Friends/post_v1_users_targetUserId_request_friendship
     *
     * @param targetUserId User ID
     * @return Whether the operation is succeed
     */
    String sendFriendRequest(double targetUserId);
}
