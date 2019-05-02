package rbxapi.javablox.api.auth;

import rbxapi.javablox.model.auth.LoginResponse;
import rbxapi.javablox.model.auth.ResetRequest;
import rbxapi.javablox.model.auth.TargetType;
import rbxapi.javablox.model.common.bool.Valid;
import rbxapi.javablox.model.common.user.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Credential {

    @GET("v2/passwords/current-status")
    Call<Valid> isPasswordValid();

    @GET("v2/passwords/reset")
    Call<User[]> getPasswordResetMetadata(@Query("request.targetType") TargetType targetType, @Query("request.ticket") String ticket);

    /**
     * @implNote This will log the user out of all sessions and re-authenticate.
     * @param request ResetRequest
     * @return LoginResponse
     */
    @POST("v2/passwords/reset")
    Call<LoginResponse> resetPassword(@Body ResetRequest request);
}
