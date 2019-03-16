package io.github.rbxapi.javablox.api.chat.chat;

public interface Message {

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

    /**
     * Gets the unread messages for the conversationIds specified in the parameters
     * https://chat.roblox.com/docs#!/Chat/get_v2_get_unread_messages
     *
     * @param conversationIds list of ids
     * @param pageSize page size
     * @return [
     *   {
     *     "conversationId": 0,
     *     "chatMessages": [
     *       {
     *         "id": "string",
     *         "senderType": "User",
     *         "sent": "2018-09-16T08:35:38.426Z",
     *         "read": true,
     *         "messageType": "PlainText",
     *         "decorators": [
     *           "string"
     *         ],
     *         "senderTargetId": 0,
     *         "content": "string",
     *         "chatMessageLinkType": "GameLink",
     *         "universeId": 0
     *       }
     *     ]
     *   }
     * ]
     */
    String getUnreadMessages(int[] conversationIds, int pageSize);

    /**
     * Gets latest messages corresponding to the given list of conversation Ids
     * https://chat.roblox.com/docs#!/Chat/get_v2_multi_get_latest_messages
     *
     * @param conversationIds Ids
     * @param pageSize size
     * @return [
     *   {
     *     "conversationId": 0,
     *     "chatMessages": [
     *       {
     *         "id": "string",
     *         "senderType": "User",
     *         "sent": "2018-09-16T11:52:31.014Z",
     *         "read": true,
     *         "messageType": "PlainText",
     *         "decorators": [
     *           "string"
     *         ],
     *         "senderTargetId": 0,
     *         "content": "string",
     *         "chatMessageLinkType": "GameLink",
     *         "universeId": 0
     *       }
     *     ]
     *   }
     * ]
     */
    String getLatestMessages(int[] conversationIds, int pageSize);

    /**
     * https://chat.roblox.com/docs#!/Chat/post_v2_send_game_link_message
     * @param requestModel {
     *   "universeId": 0,
     *   "conversationId": 0,
     *   "decorators": [
     *     "string"
     *   ]
     * }
     * @return {
     *   "chatMessageLinkType": "GameLink",
     *   "messageId": "string",
     *   "sent": "2018-09-16T11:52:31.044Z",
     *   "messageType": "PlainText",
     *   "resultType": "Success",
     *   "statusMessage": "string"
     * }
     */
    String sendGameLinkMessage(String requestModel);

    /**
     * Sends a chat message
     * https://chat.roblox.com/docs#!/Chat/post_v2_send_message
     * @param requestModel {
     *   "message": "string",
     *   "conversationId": 0,
     *   "decorators": [
     *     "string"
     *   ]
     * }
     * @return {
     *   "content": "string",
     *   "filteredForReceivers": true,
     *   "messageId": "string",
     *   "sent": "2018-09-16T11:52:31.049Z",
     *   "messageType": "PlainText",
     *   "resultType": "Success",
     *   "statusMessage": "string"
     * }
     */
    String sendMessage(String requestModel);
}
