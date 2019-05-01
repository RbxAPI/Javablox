package rbxapi.javablox.api.accountsettings;

import rbxapi.javablox.response.accountsettings.SetInventoryTradePrivacy;
import rbxapi.javablox.response.accountsettings.TradePrivacy;
import rbxapi.javablox.response.accountsettings.TradeValue;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface TradeSettings {

    @GET("v1/trade-privacy")
    Call<TradePrivacy> getTradePrivacy();

    @POST("v1/trade-privacy")
    Call<SetInventoryTradePrivacy> setTradePrivacy(@Body TradePrivacy model);

    @GET("v1/trade-value")
    Call<TradeValue> getTradeQualityFilters();

    @POST("v1/trade-value")
    Call setTradeQualityFilters(@Body TradeValue model);
}
