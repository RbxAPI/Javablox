package rbxapi.javablox.api.develop;

import rbxapi.javablox.model.common.universe.Universe;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

public interface UniverseSettings {

    @GET("/v2/universes/{universeId}/configuration")
    Call<Universe> getUniverse(@Path("universeId") long universeId);

    @PATCH("/v2/universes/{universeId}/configuration")
    Call<Universe> setUniverse(@Path("universeId") long universeId, @Body Universe model);
}
