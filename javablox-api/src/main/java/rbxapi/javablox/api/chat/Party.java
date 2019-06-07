package rbxapi.javablox.api.chat;

import rbxapi.javablox.model.chat.*;
import rbxapi.javablox.model.common.serial.SuccessStatusMessage;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Party {

    @GET("/v1.0/party/get-current")
    Call<CurrentParty> getCurrentParty();

    @GET("/v1.0/party/get-invites")
    Call<rbxapi.javablox.model.common.chat.party.Party[]> getInvites(
            @Query("pageNumber") int pageNumber,
            @Query("pageSize") int pageSize);

    @GET("/v1.0/party/get-parties-for-conversations")
    Call<rbxapi.javablox.model.common.chat.party.Party[]> getConversationParties(@Query("conversationIds") long[] conversationIds);

    @POST("/v1.0/party/create")
    Call<rbxapi.javablox.model.common.chat.party.Party> create(@Body PartyCreateRequest request);

    @POST("/v1.0/party/invite")
    Call<rbxapi.javablox.model.common.chat.party.Party> invite(@Body PartyInviteRequest request);

    @POST("/v1.0/party/join")
    Call<SuccessStatusMessage> join(@Body PartyJoinRequest request);

    @POST("/v1.0/party/leave")
    Call<rbxapi.javablox.model.common.chat.party.Party> leave(@Body PartyIDRequest request);

    @POST("/v1.0/party/remove-from-party")
    Call<rbxapi.javablox.model.common.chat.party.Party> removeUser(@Body PartyRemoveRequest request);

    @POST("/v1.0/party/take-leadership")
    Call<SuccessStatusMessage> takeLeadership(@Body PartyIDRequest request);

    @POST("/v1.0/party/update-user-device")
    Call<SuccessStatusMessage> updateUserDevice();
}
