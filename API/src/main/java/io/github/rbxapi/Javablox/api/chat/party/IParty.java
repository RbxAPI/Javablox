package io.github.rbxapi.Javablox.api.chat.party;

public interface IParty {
    
    /**
    *   https://chat.roblox.com/docs#!/Party/get_v1_0_party_get_current
    */
    String getCurrentParty();

    /**
    * https://chat.roblox.com/docs#!/Party/get_v1_0_party_get_invites
    */
    String getInvites(int pageNumber, int pageSize);

    /**
    * https://chat.roblox.com/docs#!/Party/get_v1_0_party_get_parties_for_conversations
    */
    String getPartiesForConversations(int[] conversationIds);

    /**
    * https://chat.roblox.com/docs#!/Party/post_v1_0_party_create
    */
    String createParty(String request);

    /**
    * https://chat.roblox.com/docs#!/Party/post_v1_0_party_invite
    */
    String partyInvite(String request);

    /**
    * https://chat.roblox.com/docs#!/Party/post_v1_0_party_join
    */
    String joinParty(String request);

    /**
    * https://chat.roblox.com/docs#!/Party/post_v1_0_party_leave
    */
    String leaveParty(String request);

    /**
    * https://chat.roblox.com/docs#!/Party/post_v1_0_party_remove_from_party
    */
    String removeFromParty(String request);

    /**
    * https://chat.roblox.com/docs#!/Party/post_v1_0_party_take_leadership
    */
    String takeLeadership(String request);

    /**
    * https://chat.roblox.com/docs#!/Party/post_v1_0_party_update_user_device
    */
    String updateUserDevice();
}