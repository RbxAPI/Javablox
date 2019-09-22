package rbxapi.javablox.svc;

import rbxapi.javablox.api.user.account.Birthdate;
import rbxapi.javablox.data.AccountInfoMetadata;
import rbxapi.javablox.data.Count;
import rbxapi.javablox.data.Description;
import rbxapi.javablox.data.Gender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AccountInfoService {

    @GET("v1/birthdate")
    Call<Birthdate> getBirthdate();

    @POST("v1/birthdate")
    Call<Void> updateBirthdate(@Body Birthdate request);

    @GET("v1/description")
    Call<Description> getDescription();

    @POST("v1/description")
    Call<Void> setDescription(@Body Description request);

    @GET("v1/gender")
    Call<Gender> getGender();

    @POST("v1/gender")
    Call<Void> setGender(@Body Gender request);

    @GET("v1/xbox-live/consecutive-login-days")
    Call<Count> getXboxConsecutiveLoginDays();

    @GET("v1/metadata")
    Call<AccountInfoMetadata> getMetadata();
}
