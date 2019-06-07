package rbxapi.javablox.api.accountsettings;

import rbxapi.javablox.model.accountsettings.ThemeTypes;
import rbxapi.javablox.model.accountsettings.ConsumerType;
import rbxapi.javablox.model.accountsettings.ThemeType;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

public interface ThemeConfiguration {

    @GET("v1/themes/type")
    Call<ThemeTypes> getEnabledThemeTypes();

    @GET("v1/themes/{consumerType}/{consumerId}")
    Call<ThemeType> getConsumerThemeType(@Path("consumerType") ConsumerType consumerType, @Path("consumerId") long consumerId);

    @PATCH("v1/themes/{consumerType}/{consumerId}")
    Call setConsumerThemeType(@Body ThemeType request, @Path("consumerType") ConsumerType consumerType, @Path("consumerId") long consumerId);
}