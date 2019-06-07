package rbxapi.javablox.api.economy;

import rbxapi.javablox.model.economy.Revenue;
import rbxapi.javablox.model.economy.TimeFrame;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RevenueSummary {

    @GET("/v1/groups/{groupId}/revenue/summary/{timeFrame}")
    Call<Revenue> getGroupRevenue(
            @Path("groupID") long groupId,
            @Path("timeFrame")TimeFrame timeFrame
            );

    @GET("/v1/users/{userId}/revenue/summary/{timeFrame}")
    Call<Revenue> getUserRevenue(
            @Path("userID") long userId,
            @Path("timeFrame")TimeFrame timeFrame
    );
}
