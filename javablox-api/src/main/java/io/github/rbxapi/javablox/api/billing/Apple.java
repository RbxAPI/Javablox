package io.github.rbxapi.javablox.api.billing;

/**
 * https://billing.roblox.com/docs#/Apple
 */
public interface Apple {

    /**
     * Perform a purchase and grant desired product.
     * https://billing.roblox.com/docs#!/Apple/post_v1_apple_purchase
     *
     * @param appleStorePurchaseModel {
     *                                "productId": "string",
     *                                "receipt": "string",
     *                                "isRetry": true
     *                                }
     * @return {}
     */
    String purchase(String appleStorePurchaseModel);

    /**
     * Validate a ProductId before making a purchase.
     * https://billing.roblox.com/docs#!/Apple/post_v1_apple_validate
     *
     * @param validateModel {
     *                      "productId": "string",
     *                      "currency": "string"
     *                      }
     * @return {}
     */
    String validate(String validateModel);
}
