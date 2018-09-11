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
}
