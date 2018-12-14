package io.github.rbxapi.Javablox.api.friends.verifiedfriends;

public interface NearbyVerifiedFriends {

    /**
     * https://friends.roblox.com/docs#!/VerifiedFriends/get_v1_friends_verified_nearby_code_code
     * @param code The code
     * @return Friendship data
     */
    String getData(String code);

    /**
     * https://friends.roblox.com/docs#!/VerifiedFriends/get_v1_friends_verified_nearby_health
     * @return Session health
     */
    String isSessionAlive();

    /**
     * https://friends.roblox.com/docs#!/VerifiedFriends/post_v1_friends_verified_nearby_code_redeem
     * @param code The code
     * @return Status Code
     */
    String redeemCode(String code);

    /**
     * https://friends.roblox.com/docs#!/VerifiedFriends/delete_v1_friends_verified_nearby_session
     * @return Status code
     */
    String removeSession();

    /**
     * https://friends.roblox.com/docs#!/VerifiedFriends/post_v1_friends_verified_nearby_session
     * @return Session details
     */
    String createSession();
}
