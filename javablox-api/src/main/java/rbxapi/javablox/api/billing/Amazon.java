package rbxapi.javablox.api.billing;

import rbxapi.javablox.model.billing.AmazonPurchaseRequest;
import rbxapi.javablox.model.billing.PurchaseValidateRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Amazon {

    @POST("v1/amazon/purchase")
    Call purchase(@Body AmazonPurchaseRequest amazonStorePurchaseModel);

    @POST("v1/amazon/purchase")
    Call validate(@Body PurchaseValidateRequest validateModel);
}
