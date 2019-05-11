package rbxapi.javablox.api.avatar;

import rbxapi.javablox.model.avatar.*;
import rbxapi.javablox.model.common.avatar.Scale;
import rbxapi.javablox.model.common.serial.Boolean;
import retrofit2.Call;
import retrofit2.http.*;

public interface Avatar {

    @GET("v1/avatar")
    Call<AvatarResponse> getAvatar();

    @GET("v1/avatar/metadata")
    Call<AvatarMetadata> getMetadata();

    /**
     * @implNote BodyColorsPalette is a list of valid brickColors you can choose for your avatar. WearableAssetTypes contains a list of asset types with names, ids, and the maximum number that you can wear at a time. Does not include packages because they cannot be worn on your avatar directly. PlayerAvatarTypes are the types of avatars you can choose between.
     * @return Avatar Rule
     */
    @GET("v1/avatar-rules")
    Call<AvatarRule> getAvatarRule();

    @GET("v1/users/{userid}/avatar")
    Call<AvatarResponse> getUserAvatar(@Path("userId") long userId);

    @GET("v1/users/{userid}/currently-wearing")
    Call<AssetIds> getCurrentlyWearing(@Path("userId") int userId);

    @GET("v1/users/{userid}/outfits")
    Call<OutfitResponse> getOutfits(
            @Path("userId") int userId,
            @Query("page") int page,
            @Query("itemsPerPage") int itemsPerPage,
            @Query("isEditable") boolean isEditable
    );

    @POST("/v1/avatar/assets/{assetId}/remove")
    Call<Boolean> removeAsset(@Path("assetId") long assetId);

    @POST("/v1/avatar/assets/{assetId}/wear")
    Call<Boolean> wearAsset(@Path("assetId") long assetId);

    @POST("/v1/avatar/redraw-thumbnail")
    Call redrawThumbnail();

    @POST("/v1/avatar/set-body-colors")
    Call<Boolean> setBodyColors(@Body BodyColorModel bodyColorsModel);

    /**
     * @implNote This is the avatar type chosen on the Avatar page. Some games can override this and force your character to be R6 or R15.
     * @param playerAvatarTypeModel model
     * @return Success
     */
    @POST("/v1/avatar/set-player-avatar-type")
    Call<Boolean> setAvatarType(@Body PlayerAvatarTypeModel playerAvatarTypeModel);

    @POST("/v1/avatar/set-scales")
    Call<Boolean> setScale(@Body Scale scalesModel);

    /**
     * @implNote Only allows items that you own, are not expired, and are wearable asset types. Any assets being worn before this method is called are automatically removed.
     * @param assetIdsModel model
     * @return Invalid stuff
     */
    @POST("v1/avatar/set-wearing-assets")
    Call<WearAssetsResponse> setWearAssets(@Body AssetIds assetIdsModel);
}
