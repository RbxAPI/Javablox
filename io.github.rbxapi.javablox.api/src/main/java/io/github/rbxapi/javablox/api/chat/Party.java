package io.github.rbxapi.javablox.api.chat;

public interface Party {

    /**
     * https://chat.roblox.com/docs#!/Party/get_v1_0_party_get_current
     *
     * @return Status Code
     */
    String getCurrentParty();

    /**
     * https://chat.roblox.com/docs#!/Party/get_v1_0_party_get_invites
     *
     * @param pageNumber Page Number
     * @param pageSize   Page Size
     * @return Status Code
     */
    String getInvites(int pageNumber, int pageSize);

    /**
     * https://chat.roblox.com/docs#!/Party/get_v1_0_party_get_parties_for_conversations
     *
     * @param conversationIds Conversation IDs
     * @return Status Code
     */
    String getPartiesForConversations(int[] conversationIds);

    /**
     * https://chat.roblox.com/docs#!/Party/post_v1_0_party_create
     *
     * @param request JSON
     * @return Status
     */
    String createParty(String request);

    /**
     * https://chat.roblox.com/docs#!/Party/post_v1_0_party_invite
     *
     * @param request JSON
     * @return Status
     */
    String inviteParty(String request);

    /**
     * https://chat.roblox.com/docs#!/Party/post_v1_0_party_join
     *
     * @param request JSON
     * @return Status
     */
    String joinParty(String request);

    /**
     * https://chat.roblox.com/docs#!/Party/post_v1_0_party_leave
     *
     * @param request JSON
     * @return Status
     */
    String leaveParty(String request);

    /**
     * https://chat.roblox.com/docs#!/Party/post_v1_0_party_remove_from_party
     *
     * @param request JSON
     * @return Status
     */
    String removeFromParty(String request);

    /**
     * https://chat.roblox.com/docs#!/Party/post_v1_0_party_take_leadership
     *
     * @param request JSON
     * @return Status
     */
    String takeLeadership(String request);

    /**
     * https://chat.roblox.com/docs#!/Party/post_v1_0_party_update_user_device
     *
     * @return Status
     */
    String updateUserDevice();
}