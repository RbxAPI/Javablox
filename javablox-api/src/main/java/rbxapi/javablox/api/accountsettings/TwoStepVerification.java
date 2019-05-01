package rbxapi.javablox.api.accountsettings;

import rbxapi.javablox.response.accountsettings.PasswordEnabled;
import rbxapi.javablox.response.common.bool.Enabled;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface TwoStepVerification {

    @GET("v2/twostepverification")
    Call<Enabled> is2FAEnabled();

    @POST("v2/twostepverification")
    Call set2FAEnable(@Body PasswordEnabled requestBody);
}
