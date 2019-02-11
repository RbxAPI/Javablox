package io.github.rbxapi.javablox.api.billing.google;

/**
 * https://billing.roblox.com/docs#/Google
 */
public interface IGoogleBilling {

    /**
     * Perform a purchase and grant desired product
     * https://billing.roblox.com/docs#!/Google/post_v1_google_purchase
     * @param purchaseModel {
     *   "packageName": "string",
     *   "productId": "string",
     *   "token": "string",
     *   "isRetry": true,
     *   "orderId": "string"
     * }
     * @return {}
     */
    String purchase(String purchaseModel);

    /**
     * Validate a ProductId before making a purchase
     * https://billing.roblox.com/docs#!/Google/post_v1_google_validate
     * @param validateModel {
     *   "productId": "string",
     *   "currency": "string"
     * }
     * @return {}
     */
    String validate(String validateModel);
}
