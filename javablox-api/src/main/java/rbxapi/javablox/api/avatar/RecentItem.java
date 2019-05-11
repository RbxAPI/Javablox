package rbxapi.javablox.api.avatar;

import rbxapi.javablox.model.avatar.ItemListType;
import rbxapi.javablox.model.avatar.OutfitResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RecentItem {

    @GET("v1/recent-items/{recentItemListType}/list")
    Call<OutfitResponse> getRecentItems(@Path("recentItemListType") ItemListType itemListType);
}
