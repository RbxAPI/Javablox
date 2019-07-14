package rbxapi.javablox.svc;

import rbxapi.javablox.api.user.account.info.Birthdate;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AccountInfoService {

    @GET("/v1/birthdate")
    Call<Birthdate> getBirthdate();

    @POST("/v1/birthdate")
    Call<Void> updateBirthdate(@Body Birthdate request);
}
