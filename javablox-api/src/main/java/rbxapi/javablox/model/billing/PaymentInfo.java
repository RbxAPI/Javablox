package rbxapi.javablox.model.billing;

public class PaymentInfo {
    private String paymentDate;
    private Product[] products;
    private Money money;
    private PaymentProviderType paymentProviderType;
    private CreditCardType creditCardType;
    private String creditCardNumber;
}
