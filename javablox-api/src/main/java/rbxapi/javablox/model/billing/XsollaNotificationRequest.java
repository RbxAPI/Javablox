package rbxapi.javablox.model.billing;

import rbxapi.javablox.model.billing.xsolla.*;

public class XsollaNotificationRequest {
    private String notification_type;
    private PurchaseRequest purchase;
    private UserRequest user;
    private TransactionRequest transaction;
    private PaymentDetailRequest payment_details;
    private RefundRequest refund_details;
    private CustomParametersRequest custom_parameters;
}
