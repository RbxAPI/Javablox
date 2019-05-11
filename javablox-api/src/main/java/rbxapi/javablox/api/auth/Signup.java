package rbxapi.javablox.api.auth;

import rbxapi.javablox.model.auth.SignupRequest;
import rbxapi.javablox.model.auth.SignupResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Signup {

    @POST("v2/signup")
    Call<SignupResponse> signup(@Body SignupRequest request);
}
