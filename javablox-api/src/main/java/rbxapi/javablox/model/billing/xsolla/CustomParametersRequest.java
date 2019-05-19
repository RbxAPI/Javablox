package rbxapi.javablox.model.billing.xsolla;

public class CustomParametersRequest {
    private int user_id;
    private int payment_method;
    private int account_id;
    private int checkout_session_id;
    private int main_product;
    private int main_product_price;
    private int upsell_product;
    private int upsell_product_price;
    private int total_price;
    private String currency;
    private String transaction_time;
    private String ip_address;
    private int price_country_id;
}
