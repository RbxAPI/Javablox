package rbxapi.javablox.api.accountsettings;

import rbxapi.javablox.response.accountsettings.*;
import rbxapi.javablox.response.accountsettings.SetInventoryTradePrivacy;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PrivacySettings {

    @GET("v1/app-chat-privacy")
    Call<AppChatPrivacy> getAppChatPrivacy();

    @POST("v1/app-chat-privacy")
    Call setAppChatPrivacy(@Body AppChatPrivacy model);

    @GET("v1/game-chat-privacy")
    Call<GameChatPrivacy> getGameChatPrivacy();

    @POST("v1/game-chat-privacy")
    Call setGameChatPrivacy(@Body GameChatPrivacy model);

    @GET("v1/inventory-privacy")
    Call<InventoryPrivacy> getInventoryPrivacy();

    @POST("v1/inventory-privacy")
    Call<SetInventoryTradePrivacy> setInventoryPrivacy(@Body InventoryPrivacy model);

    @GET("v1/privacy")
    Call<PhoneDiscovery> getPhoneDiscoveryPrivacy();

    @POST("v1/privacy")
    Call setPhoneDiscoveryPrivacy(@Body PhoneDiscovery model);

    @GET("v1/privacy/info")
    Call<PhoneDiscoveryEnabled> isPhoneDiscoveryEnabled();

    @GET("v1/private-message-privacy")
    Call<PrivateMessagePrivacy> getPrivateMessagePrivacy();

    @POST("v1/private-message-privacy")
    Call setPrivateMessagePrivacy(@Body PrivateMessagePrivacy model);
}
