package rbxapi.javablox.model.common.chat.party;

import rbxapi.javablox.model.common.user.User;

public abstract class BaseParty {
    private String Id;
    private int ConversationId;
    private User CreatorUser;
    private User LeaderUser;
    private User[] PendingUsers;
    private User[] MemberUsers;
    private String GameId;
    private String GameName;
    private int GamePlaceId;
    private String GameSlotExpiry;
}
