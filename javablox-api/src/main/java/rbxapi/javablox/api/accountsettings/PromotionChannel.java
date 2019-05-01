package rbxapi.javablox.api.accountsettings;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PromotionChannel {

    /**
     * @implNote If the url in the request is empty, it will delete the user's existing promotion channel of that type.
     * @param request Promotion Channels
     * @return {}
     */
    @POST("v1/promotion-channels")
    Call setPromotionChannels(@Body rbxapi.javablox.response.accountsettings.PromotionChannel request);
}
