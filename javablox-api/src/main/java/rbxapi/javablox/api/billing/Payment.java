package rbxapi.javablox.api.billing;

import rbxapi.javablox.model.billing.Payments;
import rbxapi.javablox.model.common.SortOrder;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Payment {

    @GET("v1/user/payments")
    Call<Payments> getPaymentHistory(
            @Query("sortOrder") SortOrder sortOrder,
            @Query("limit") int limit,
            @Query("cursor") String cursor);
}
