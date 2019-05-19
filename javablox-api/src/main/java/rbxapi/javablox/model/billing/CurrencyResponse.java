package rbxapi.javablox.model.billing;

public class CurrencyResponse {
    private String CurrencyType;

    public CurrencyResponse(final String CurrencyType) {
        this.CurrencyType = CurrencyType;
    }

    public String getCurrencyType() {
        return this.CurrencyType;
    }
}
