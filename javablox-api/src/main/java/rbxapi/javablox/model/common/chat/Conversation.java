package rbxapi.javablox.model.common.chat;

public class Conversation {
    private int id;
    private String title;
    private Participant initiator;
    private boolean hasUnreadMessages;
    private Participant[] participants;
    private ConversationType conversationType;
    private Title conversationTitle;
    private String lastUpdated;
    private ConversationUniverse conversationUniverse;
}
