package rbxapi.javablox.api.billing;

import rbxapi.javablox.model.billing.Pincode;
import rbxapi.javablox.model.billing.GamecardPurchaseResponse;
import rbxapi.javablox.model.billing.UserPincode;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Gamecard {

    @POST("v1/gamecard/redeem")
    Call<GamecardPurchaseResponse> redeem(@Body Pincode redemptionRequest);

    @POST("v1/gamecard/reverse")
    Call reverse(@Body UserPincode request);
}
