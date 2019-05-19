package rbxapi.javablox.api.catalog;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Favorite {

    @GET("/v1/favorites/assets/{assetId}/count")
    Call<Long> getAssetFavoriteCount(@Path("assetId") long assetId);

    @GET("/v1/favorites/bundles/{bundleId}/count")
    Call<Long> getBundleFavoriteCount(@Path("bundleId") long bundleId);

    @DELETE("/v1/favorites/users/{userId}/assets/{assetId}/favorite")
    Call deleteUserAssetFavorite(@Path("userId") long userId, @Path("assetId") long assetId);

    @GET("/v1/favorites/users/{userId}/assets/{assetId}/favorite")
    Call<rbxapi.javablox.model.catelog.Favorite> getUserAssetFavorite(@Path("assetId") long assetId, @Path("userId") long userId);

    @POST("/v1/favorites/users/{userId}/assets/{assetId}/favorite")
    Call setUserAssetFavorite(@Path("assetId") long assetId, @Path("userId") long userId);

    @DELETE("/v1/favorites/users/{userId}/bundles/{bundleId}/favorite")
    Call deleteUserBundleFavorite(@Path("userId") long userId, @Path("bundleId") long bundleId);

    @GET("/v1/favorites/users/{userId}/bundles/{bundleId}/favorite")
    Call<rbxapi.javablox.model.catelog.Favorite> getUserBundleFavorite(@Path("bundleId") long bundleId, @Path("userId") long userId);

    @POST("/v1/favorites/users/{userId}/bundles/{bundleId}/favorite")
    Call setUserBundleFavorite(@Path("bundleId") long bundleId, @Path("userId") long userId);
}
