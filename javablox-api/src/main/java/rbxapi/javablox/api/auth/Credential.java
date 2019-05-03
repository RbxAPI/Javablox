package rbxapi.javablox.api.auth;

import rbxapi.javablox.model.auth.ContactType;
import rbxapi.javablox.model.auth.LoginRequestPassword;
import rbxapi.javablox.model.common.bool.CanSend;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Credential {

    @GET("v2/credentials/verification")
    Call<CanSend> canSendVerificationEmail(
            @Query("request.credentialType") ContactType contactType,
            @Query("request.credentialValue") String value,
            @Query("request.password") String password);

    @POST("v2/credentials/verification")
    Call sendVerificationEmail(@Body LoginRequestPassword request);
}
