package rbxapi.javablox.api.catalog;

import rbxapi.javablox.model.common.CursorResponse;
import rbxapi.javablox.model.common.SortOrder;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Bundle {

    @GET("v1/assets/{assetId}/bundles")
    Call<CursorResponse<rbxapi.javablox.model.common.bundle.Bundle>> getAssetBundles(
            @Path("assetId") long assetId,
            @Query("sortOrder")SortOrder sortOrder,
            @Query("limit") int limit,
            @Query("cursor") String cursor
            );

    @GET("v1/bundles/{bundleId}/details")
    Call<CursorResponse<rbxapi.javablox.model.common.bundle.Bundle>> getBundle(@Path("bundleId") long bundleId);

    @GET("v1/bundles/details")
    Call<CursorResponse<rbxapi.javablox.model.common.bundle.Bundle>[]> getBundles(@Query("bundleIds") long[] bundleId);

    @GET("v1/users/{userId}/bundles")
    Call<CursorResponse<rbxapi.javablox.model.common.bundle.Bundle>> getUserBundles(
            @Path("userId") long userId,
            @Query("sortOrder")SortOrder sortOrder,
            @Query("limit") int limit,
            @Query("cursor") String cursor
    );

    @POST("v1/bundles/{bundleId}/unpack")
    Call unpack(@Path("bundleId") long bundleId);
}
