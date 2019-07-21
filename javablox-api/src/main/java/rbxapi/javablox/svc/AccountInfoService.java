package rbxapi.javablox.svc;

import rbxapi.javablox.api.user.account.info.Birthdate;
import rbxapi.javablox.model.Description;
import rbxapi.javablox.model.Gender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AccountInfoService {

    @GET("/v1/birthdate")
    Call<Birthdate> getBirthdate();

    @POST("/v1/birthdate")
    Call<Void> updateBirthdate(@Body Birthdate request);

    @GET("/v1/description")
    Call<Description> getDescription();

    @POST("v1/description")
    Call<Void> setDescription(@Body Description request);

    @GET("/v1/gender")
    Call<Gender> getGender();

    @POST("/v1/gender")
    Call<Void> setGender(@Body Gender request);
}
