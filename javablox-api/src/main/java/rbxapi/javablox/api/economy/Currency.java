package rbxapi.javablox.api.economy;

import rbxapi.javablox.model.economy.Robux;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Currency {

    /**
     * @implNote Currency can only be retrieved for groups the authenticated user has permission to view group funds for.
     * @param groupId Group ID
     * @return Robux
     */
    @GET("/v1/groups/{groupId}/currency")
    Call<Robux> getGroupRobux(@Path("groupId") long groupId);

    /**
     * @implNote Currency can only be retrieved for the authenticated user.
     * @param userId User ID
     * @return Robux
     */
    @GET("/v1/users/{userId}/currency")
    Call<Robux> getUserRobux(@Path("userId") long userId);
}
