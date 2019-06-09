package rbxapi.javablox.api.develop;

import rbxapi.javablox.model.common.ApiArrayResponse;
import rbxapi.javablox.model.develop.AssetVoting;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Assets {

    @GET("/v1/assets/voting")
    Call<ApiArrayResponse<AssetVoting>> getAssetVoting(@Query("assetIds") long[] assetIds);
}
