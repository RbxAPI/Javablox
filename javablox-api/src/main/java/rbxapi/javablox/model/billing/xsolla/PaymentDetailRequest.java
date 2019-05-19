package rbxapi.javablox.model.billing.xsolla;

public class PaymentDetailRequest {
    private CurrencyAmount payment;
    private CurrencyAmount payment_method_sum;
    private CurrencyAmount xsolla_balance_sum;
    private CurrencyAmount payout;
    private CurrencyAmount xsolla_fee;
    private CurrencyAmount payment_method_fee;
    private CurrencyAmount vat;
    private CurrencyAmount sales_tax;
    private String payout_currency_rate;
}
