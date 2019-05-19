package rbxapi.javablox.model.billing.xsolla;

public class PurchaseRequest {
    private VirtualCurrencyRequest virtual_currency;
    private VirtualItemRequest virtual_items;
    private CurrencyAmount checkout;
    private SubscriptionRequest subscription;
    private CurrencyAmount total;
}
