package io.github.rbxapi.javablox.api.friends.verifiedfriends;

public interface QRVerifiedFriends {

    /**
     * https://friends.roblox.com/docs#!/VerifiedFriends/delete_v1_friends_verified_qr_session
     * @return Status code
     */
    String deleteSession();

    /**
     * https://friends.roblox.com/docs#!/VerifiedFriends/post_v1_friends_verified_qr_session
     * @return Status code
     */
    String createSession();
}
