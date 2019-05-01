package rbxapi.javablox.api.accountsettings;

import rbxapi.javablox.response.accountsettings.XboxUsernameValid;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface Xbox {

    @GET("v1/xbox/is-username-valid")
    Call<XboxUsernameValid> isUsernameValid(
            @Header("Authorization") String authorization,
            @Header("Signature") String signature,
            @Query("request.username") String username);

}
