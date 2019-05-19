package rbxapi.javablox.model.common.chat;

public class Message {
    private String id;
    private ParticipantType senderType;
    private String sent;
    private boolean read;
    private MessageType messageType;
    private String[] decorators;
    private int senderTargetId;
    private String content;
    private Link link;
    private EventBased eventBased;
}
