package rbxapi.javablox.api.auth;

import rbxapi.javablox.model.auth.CookieLawNoticeTimeout;
import rbxapi.javablox.model.auth.LoginRequest;
import rbxapi.javablox.model.auth.LoginResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Authentication {

    @GET("v2/auth/metadata")
    Call<CookieLawNoticeTimeout> getAuthMetadata();

    //TODO: Return Cookie auth in javablox-endpoint
    @POST("v2/login")
    Call<LoginResponse> login(@Body LoginRequest request);

    @POST("v2/logout")
    Call logout();
}
