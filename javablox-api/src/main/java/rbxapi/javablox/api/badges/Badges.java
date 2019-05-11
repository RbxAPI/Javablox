package rbxapi.javablox.api.badges;

import rbxapi.javablox.model.badge.BadgesResponse;
import rbxapi.javablox.model.badge.UpdateBadgeRequest;
import rbxapi.javablox.model.common.SortOrder;
import rbxapi.javablox.model.common.badge.Badge;
import retrofit2.Call;
import retrofit2.http.*;

public interface Badges {

    @GET("v1/badges/{badgeId}")
    Call<Badge> getBadge(@Path("badgeId") long badgeId);

    @PATCH("/v1/badges/{badgeId}")
    Call update(
            @Path("badgeId") long badgeId,
            @Body UpdateBadgeRequest request
            );

    @GET("v1/universes/{universeId}/badges")
    Call<BadgesResponse> getUniverseBadges(
            @Path("universeId") long universeId,
            @Query("sortOrder")SortOrder sortOrder,
            @Query("limit") int limit,
            @Query("cursor") String cursor
            );

    @GET("v1/users/{userId}/badges")
    Call<BadgesResponse> getUserBadges(
            @Path("userId") long userId,
            @Query("sortOrder")SortOrder sortOrder,
            @Query("limit") int limit,
            @Query("cursor") String cursor
            );
}
