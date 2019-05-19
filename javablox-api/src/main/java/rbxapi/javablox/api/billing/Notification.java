package rbxapi.javablox.api.billing;

import rbxapi.javablox.model.billing.XsollaNotificationRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Notification {

    @POST("v1/notifications/xsolla")
    Call notifyXsolla(@Body XsollaNotificationRequest xsollaNotificationModel);
}
