package rbxapi.javablox.api.chat;

import rbxapi.javablox.model.chat.*;
import rbxapi.javablox.model.common.chat.Conversation;
import rbxapi.javablox.model.common.chat.Message;
import rbxapi.javablox.model.common.place.PlaceID;
import rbxapi.javablox.model.common.serial.Count;
import rbxapi.javablox.model.common.serial.StatusMessage;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Chat {

    @GET("v2//v2/chat-settings")
    Call<ChatSetting> getChatSetting();

    @GET("/v2/get-conversations")
    Call<Conversation[]> getConversations(@Query("conversationIds") long[] ids);

    @GET("/v2/get-messages")
    Call<Message[]> getConversationMessages(
            @Query("conversationId") long id,
            @Query("pageSize") int size,
            @Query("exclusiveStartMessageId") String msg
    );

    @GET("/v2/get-rollout-settings")
    Call<RolloutSettingResponse> getRolloutSetting(@Query("featureNames") RolloutFeature[] features);

    @GET("/v2/get-unread-conversation-count")
    Call<Count> getUnreadConversationCount();

    @GET("/v2/get-unread-messages")
    Call<MessageResponse> getUnreadMessages(@Query("conversationIds") long[] ids, @Query("pageSize") int size);

    @GET("/v2/get-user-conversations")
    Call<Conversation[]> getUserConversations(@Query("pageNumber") int num, @Query("pageSize") int size);

    @GET("/v2/metadata")
    Call<Metatdata> getMetadata();

    @GET("/v2/multi-get-latest-messages")
    Call<MessageResponse> getMultiLatestMessages(@Query("conversationIds") long[] ids, @Query("pageSize") int size);

    @POST("/v2/add-to-conversation")
    Call<StartNewConversationResponse> addToConversation(@Body ParticipantsConversationRequest requestModel);

    @POST("/v2/mark-as-read")
    Call<MarkAsResponse> markAsRead(@Body ConversationEndMessageRequest requestModel);

    @POST("/v2/mark-as-seen")
    Call<MarkAsResponse> markAsSeen(@Body MarkAsSeenRequest requestModel);

    @POST("/v2/remove-from-conversation")
    Call<RemoveUserFromConversationResponse> removeFromConversation(@Body ParticipantConversationRequest requestModel);

    @POST("/v2/rename-group-conversation")
    Call<RenameConversationResponse> renameGroupConversation(@Body RenameGroupConversationRequest requestModel);

    @POST("/v2/reset-conversation-universe")
    Call<StatusMessage> resetConversationUniverse(@Body ConversationId requestModel);

    @POST("/v2/send-game-link-message")
    Call<SendGameLinkMessageResponse> sendGameLinkMessage(@Body GameLinkRequest requestModel);

    @POST("/v2/send-message")
    Call<SendMessageResponse> sendMessage(@Body MessageRequest requestModel);

    @POST("/v2/set-conversation-universe")
    Call<StatusMessage> setConversationUniverse(@Body ConversationUniverseRequest requestModel);

    @POST("/v2/start-cloud-edit-conversation")
    Call<StartNewConversationResponse> startCloudEditConversation(@Body PlaceID requestModel);

    @POST("/v2/start-group-conversation")
    Call<StartNewConversationResponse> startGroupConversation(@Body ParticipantsConversationRequest requestModel);

    @POST("/v2/start-one-to-one-conversation")
    Call<StartNewConversationResponse> startOneToOneConversation(@Body ParticipantUserID requestModel);

    @POST("/v2/update-user-typing-status")
    Call<StatusMessage> setTypingStatus(@Body TypingRequest requestModel);
}
