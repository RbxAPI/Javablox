package rbxapi.javablox.api.auth;

import rbxapi.javablox.model.auth.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Username {

    @GET("v2/usernames")
    Call<UsernamesResponse> getUsernames(@Query("username") String username);

    @GET("v2/usernames/validate")
    Call<UsernameValidationResponse> validateUsername(
            @Query("request.username") String username,
            @Query("request.birthday") String birthday,
            @Query("request.context") UsernameValidationContext context
            );

    @POST("v2/usernames/recover")
    Call<TransmissionTypeResponse> sendRecover(@Body TargetRequest request);
}
