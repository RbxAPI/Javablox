package rbxapi.javablox.api.develop;

import rbxapi.javablox.model.develop.GameUpdateNotification;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface GameUpdateNotifications {

    @GET("/v1/gameUpdateNotifications/{universeId}")
    Call<GameUpdateNotification[]> getGameUpdateNotifications(@Path("universeId") long universeId);

    @POST("/v1/gameUpdateNotifications/{universeId}")
    Call<GameUpdateNotification> sendGameUpdateNotification(@Path("universeId") long universeId, @Body String gameUpdateText);

    @POST("/v1/gameUpdateNotifications/filter")
    Call filterText(@Body String gameUpdateText);
}
