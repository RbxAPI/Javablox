package rbxapi.javablox.api.billing;

import rbxapi.javablox.model.billing.XsollaIframeRequest;
import rbxapi.javablox.model.billing.XsollaPayResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface XsollaPayment {

    @POST("v1/payments/xsolla/iframe-token")
    Call<XsollaPayResponse> getIframeToken(@Body XsollaIframeRequest xsollaIframeRequest);
}
