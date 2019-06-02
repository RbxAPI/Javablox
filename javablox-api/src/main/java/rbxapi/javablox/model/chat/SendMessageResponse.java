package rbxapi.javablox.model.chat;

import rbxapi.javablox.model.common.chat.MessageType;

public class SendMessageResponse {
    private String content;
    private boolean filteredForReceivers;
    private String messageId;
    private String sent;
    private MessageType messageType;
    private MessageResultType resultType;
    private String statusMessage;
}
