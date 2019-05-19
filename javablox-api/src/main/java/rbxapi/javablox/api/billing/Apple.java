package rbxapi.javablox.api.billing;

import rbxapi.javablox.model.billing.ApplePurchaseRequest;
import rbxapi.javablox.model.billing.PurchaseValidateRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Apple {

    @POST("v1/apple/purchase")
    Call purchase(@Body ApplePurchaseRequest appleStorePurchaseModel);

    @POST("v1/apple/validate")
    Call validate(@Body PurchaseValidateRequest validateModel);
}
