package rbxapi.javablox.api.accountsettings;

import rbxapi.javablox.response.accountsettings.UpsellScreenType;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AccountInfoSettings {

    @GET("v1/user/screens/contact-upsell")
    Call<UpsellScreenType> getUpsellScreenType();

    @POST("v1/user/screens/contact-upsell/suppress")
    Call suppressContactUpsell(@Body boolean suppress);
}
