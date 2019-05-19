package rbxapi.javablox.api.billing;

import rbxapi.javablox.model.billing.GooglePurchaseRequest;
import rbxapi.javablox.model.billing.PurchaseValidateRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Google {

    @POST("v1/google/purchase")
    Call purchase(@Body GooglePurchaseRequest purchaseModel);

    @POST("v1/google/validate")
    Call validate(@Body PurchaseValidateRequest validateModel);
}
