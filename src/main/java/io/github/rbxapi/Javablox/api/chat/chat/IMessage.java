package io.github.rbxapi.Javablox.api.chat.chat;

public interface IMessage {

    /**
     * Gets messages corresponding to the given conversationId
     * @param conversationId conversation Id
     * @param pageSize content per page
     * @param exclusiveStartMessageId optional
     * @return [
     *   {
     *     "id": "string",
     *     "senderType": "User",
     *     "sent": "2018-09-12T11:52:23.867Z",
     *     "read": true,
     *     "messageType": "PlainText",
     *     "decorators": [
     *       "string"
     *     ],
     *     "senderTargetId": 0,
     *     "content": "string",
     *     "chatMessageLinkType": "GameLink",
     *     "universeId": 0
     *   }
     * ]
     */
    String getMessages(int conversationId, int pageSize, String exclusiveStartMessageId);
}
