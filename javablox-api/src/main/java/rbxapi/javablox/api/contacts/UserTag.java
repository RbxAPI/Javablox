package rbxapi.javablox.api.contacts;

import rbxapi.javablox.model.contacts.UserTagStatus;
import rbxapi.javablox.model.contacts.UserTagsRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserTag {

    @POST("/v1/user/get-tags")
    Call<rbxapi.javablox.model.contacts.UserTag[]> getUserTags(@Body UserTagsRequest requestModel);

    @POST("/v1/user/set-pending-tag")
    Call<UserTagStatus> setPendingTag(@Body rbxapi.javablox.model.contacts.UserTag requestModel);

    @POST("/v1/user/tag")
    Call<UserTagStatus> setTag(@Body rbxapi.javablox.model.contacts.UserTag requestModel);
}
