package rbxapi.javablox.api.accountsettings;

import rbxapi.javablox.model.accountsettings.EmailAddressInfo;
import rbxapi.javablox.model.accountsettings.FreeItem;
import rbxapi.javablox.model.common.email.EmailInfo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Email {

    @GET("v1/email")
    Call<EmailAddressInfo> getEmail();

    @POST("v1/email")
    Call setEmailInfo(@Body EmailInfo requestBody);

    @POST("v1/email/verify")
    Call sendVerifyEmail(@Body FreeItem request);
}
