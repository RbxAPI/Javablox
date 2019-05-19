package rbxapi.javablox.api.catalog;

import rbxapi.javablox.model.LegacyPageResponse;
import rbxapi.javablox.model.catelog.AppStoreType;
import rbxapi.javablox.model.common.bundle.BundleProduct;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ExclusiveItem {

    @GET("v1/exclusive-items/{appStoreType}/bundles")
    Call<LegacyPageResponse<BundleProduct>> getAppStoreExclusiveBundles(@Path("appStoreType") AppStoreType appStoreType);
}
