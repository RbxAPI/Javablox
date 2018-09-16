package io.github.rbxapi.Javablox.api.chat.chat;

public interface IConversation {

    /**
     * Gets conversations for the conversationIds specified in the parameters
     * @param conversationIds Ids of the conversations to be returned
     * @return [
     *   {
     *     "id": 0,
     *     "title": "string",
     *     "initiator": {
     *       "type": "User",
     *       "targetId": 0,
     *       "name": "string"
     *     },
     *     "hasUnreadMessages": true,
     *     "participants": [
     *       {
     *         "type": "User",
     *         "targetId": 0,
     *         "name": "string"
     *       }
     *     ],
     *     "conversationType": "OneToOneConversation",
     *     "conversationTitle": {
     *       "titleForViewer": "string",
     *       "isDefaultTitle": true
     *     },
     *     "lastUpdated": "2018-09-11T15:16:51.121Z",
     *     "conversationUniverse": {
     *       "universeId": 0,
     *       "rootPlaceId": 0
     *     }
     *   }
     * ]
     */
    String getConversation(int[] conversationIds);

    /**
     * Gets the count of unread conversations
     * https://chat.roblox.com/docs#!/Chat/get_v2_get_unread_conversation_count
     *
     * @return {
     *   "count": 0
     * }
     */
    String getUnreadConversationCount();

    /**
     * Gets all conversations associated with the logged-in User
     * https://chat.roblox.com/docs#!/Chat/get_v2_get_user_conversations
     *
     * @param pageNumber Page number
     * @param pageSize  Page size
     * @return [
     *   {
     *     "id": 0,
     *     "title": "string",
     *     "initiator": {
     *       "type": "User",
     *       "targetId": 0,
     *       "name": "string"
     *     },
     *     "hasUnreadMessages": true,
     *     "participants": [
     *       {
     *         "type": "User",
     *         "targetId": 0,
     *         "name": "string"
     *       }
     *     ],
     *     "conversationType": "OneToOneConversation",
     *     "conversationTitle": {
     *       "titleForViewer": "string",
     *       "isDefaultTitle": true
     *     },
     *     "lastUpdated": "2018-09-16T08:35:38.431Z",
     *     "conversationUniverse": {
     *       "universeId": 0,
     *       "rootPlaceId": 0
     *     }
     *   }
     * ]
     */
    String getUserConversations(int pageNumber, int pageSize);

    /**
     * Adds users to an existing conversation
     * https://chat.roblox.com/docs#!/Chat/post_v2_add_to_conversation
     * @param requestModel {
     *   "participantUserIds": [
     *     0
     *   ],
     *   "conversationId": 0
     * }
     * @return {
     *   "conversationId": 0,
     *   "rejectedParticipants": [
     *     {
     *       "rejectedReason": "string",
     *       "type": "User",
     *       "targetId": 0,
     *       "name": "string"
     *     }
     *   ],
     *   "resultType": "Success",
     *   "statusMessage": "string"
     * }
     */
    String addToConversation(String requestModel);

    /**
     * Mark the specified conversation messages as read
     * https://chat.roblox.com/docs#!/Chat/post_v2_mark_as_read
     *
     * @param requestModel {
     *   "conversationId": 0,
     *   "endMessageId": "string"
     * }
     * @return {
     *   "resultType": "Success"
     * }
     */
    String markAsRead(String requestModel);

    /**
     * Mark the specified conversation messages as seen
     * https://chat.roblox.com/docs#!/Chat/post_v2_mark_as_seen
     *
     * @param requestModel {
     *   "conversationsToMarkSeen": [
     *     0
     *   ]
     * }
     * @return {
     *   "resultType": "Success"
     * }
     */
    String markAsSeen(String requestModel);

    /**
     * Removes a user from an existing conversation
     * https://chat.roblox.com/docs#!/Chat/post_v2_remove_from_conversation
     *
     * @param requestModel {
     *   "participantUserId": 0,
     *   "conversationId": 0
     * }
     * @return {
     *   "conversationId": 0,
     *   "resultType": "Success",
     *   "statusMessage": "string"
     * }
     */
    String removeFromConversation(String requestModel);

    /**
     * Renames the title of an existing conversation
     * https://chat.roblox.com/docs#!/Chat/post_v2_rename_group_conversation
     * @param requestModel {
     *   "conversationId": 0,
     *   "newTitle": "string"
     * }
     * @return {
     *   "conversationTitle": "string",
     *   "resultType": "Success",
     *   "title": {
     *     "titleForViewer": "string",
     *     "isDefaultTitle": true
     *   },
     *   "statusMessage": "string"
     * }
     */
    String renameGroupConversation(String requestModel);

    /**
     * Removes universe associated with a conversation
     * https://chat.roblox.com/docs#!/Chat/post_v2_reset_conversation_universe
     *
     * @param requestModel {
     *   "conversationId": 0
     * }
     * @return {
     *   "statusMessage": "string"
     * }
     */
    String resetConversationUniverse(String requestModel);



}
