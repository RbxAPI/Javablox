package rbxapi.javablox.api.auth;

import rbxapi.javablox.model.auth.*;
import rbxapi.javablox.model.common.CodeMsgPair;
import rbxapi.javablox.model.common.bool.Valid;
import rbxapi.javablox.model.common.user.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Password {

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

    @GET("v2/passwords/validate")
    Call<CodeMsgPair> validatePassword(@Query("request.username") String username, @Query("request.password") String password);

    /**
     * @implNote Phone target must be a csv with 3 values: "internationalPrefixNumber,nationalNumber,countryCode"
     * @param request TargetRequest
     * @return NonceResponse
     */
    @POST("v2/passwords/reset/send")
    Call<NonceResponse> sendResetPassword(@Body TargetRequest request);

    @POST("v2/passwords/reset/verify")
    Call<UserTicketResponse[]> verifyPasswordReset(@Body ResetVerificationRequest request);

    /**
     * @implNote The current password is needed for verification that the password can be changed.
     * @param request Model
     * @return Status Code
     */
    @POST("v2/user/passwords/change")
    Call changePassword(@Body PasswordChangeModel request);
}
