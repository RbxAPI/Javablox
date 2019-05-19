package rbxapi.javablox.api.captcha;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Metadata {

    @GET("v1/captcha/metadata")
    Call<rbxapi.javablox.model.captcha.Metadata> getMetadata();
}
