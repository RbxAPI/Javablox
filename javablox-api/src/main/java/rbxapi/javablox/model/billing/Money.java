package rbxapi.javablox.model.billing;

public class Money {
    private float Amount;
    private float USDAmount;
    private java.util.Currency Currency;

    public Money(final float Amount, final float USDAmount, final CurrencyResponse CurrencyType) {
        this.Amount = Amount;
        this.USDAmount = USDAmount;
        this.Currency = java.util.Currency.getInstance(CurrencyType.getCurrencyType());
    }
}
