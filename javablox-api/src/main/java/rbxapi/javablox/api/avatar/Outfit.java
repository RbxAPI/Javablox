package rbxapi.javablox.api.avatar;

import rbxapi.javablox.model.avatar.OutfitUpdateModel;
import rbxapi.javablox.model.avatar.WearAssetsResponse;
import rbxapi.javablox.model.common.serial.Boolean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Outfit {

    @GET("v1/outfits/{userOutfitId}/details")
    Call<rbxapi.javablox.model.common.avatar.Outfit> getOutfit(
            @Path("userOutfitId") long userOutfitId
    );

    @POST("v1/outfits/{userOutfitId}/delete")
    Call<Boolean> delete(@Path("userOutfitId") long userOutfitId);

    /**
     * @implNote Fails if the user does not own any of the assetIds or if they are not wearable asset types.
     * @param outfitUpdateModel model
     * @param userOutfitId id
     * @return Success
     */
    @POST("v1/outfits/{userOutfitId}/update")
    Call<Boolean> update(
            @Path("userOutfitId") long userOutfitId,
            @Body OutfitUpdateModel outfitUpdateModel
            );

    /**
     * @implNote Applies the outfit's appearance to your avatar If the user no longer owns one or more of the assets, invalidAssetIds will be populated with the unwearable assets.
     * @param userOutfitId id
     * @return Invalid stuff
     */
    @POST("v1/outfits/{userOutfitId}/wear")
    Call<WearAssetsResponse> wear(@Path("userOutfitId") long userOutfitId);

    @POST("v1/outfits/create")
    Call<Boolean> create(@Body OutfitUpdateModel outfitUpdateModel);
}
