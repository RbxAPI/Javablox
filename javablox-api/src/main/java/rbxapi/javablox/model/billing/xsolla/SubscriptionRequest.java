package rbxapi.javablox.model.billing.xsolla;

public class SubscriptionRequest extends CurrencyAmount {
    private int subscription_id;
    private String plan_id;
    private String product_id;
    private String date_start;
    private String date_end;
}
