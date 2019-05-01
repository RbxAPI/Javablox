package rbxapi.javablox.api.assetdelivery;

import rbxapi.javablox.model.assetdelivery.AssetBatch;
import rbxapi.javablox.model.assetdelivery.AssetRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface Batch {

    @POST("v1/assets/batch")
    Call<AssetBatch[]> batch(
            @Body AssetRequest[] assetRequestItems,
            @Header("Roblox-Place-Id") long placeId,
            @Header("Accept") String accept);
}
