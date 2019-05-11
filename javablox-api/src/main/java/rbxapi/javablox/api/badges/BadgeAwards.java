package rbxapi.javablox.api.badges;

import rbxapi.javablox.model.badge.BadgeAwardResponse;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BadgeAwards {

    @GET("v1/users/{userId}/badges/awarded-dates")
    Call<BadgeAwardResponse> getBadgeAwardDates(
            @Path("userId") long userId,
            @Query("badgeIds") long[] badgeIds
    );

    @DELETE("v1/user/badges/{badgeId}")
    Call deleteUserBadge(@Path("userId") long userId);
}
