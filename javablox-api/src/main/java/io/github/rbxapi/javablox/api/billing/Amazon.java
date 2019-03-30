package io.github.rbxapi.javablox.api.billing;

/**
 * https://billing.roblox.com/docs#!/Amazon
 */
public interface Amazon {

    /**
     * Perform a purchase and grant desired product.
     * https://billing.roblox.com/docs#!/Amazon/post_v1_amazon_purchase
     *
     * @param amazonStorePurchaseModel {
     *                                 "receiptId": "string",
     *                                 "amazonUserId": "string",
     *                                 "isRetry": true
     *                                 }
     * @return {}
     */
    String purchase(String amazonStorePurchaseModel);

    /**
     * Validate a ProductId before making a purchase
     * https://billing.roblox.com/docs#!/Amazon/post_v1_amazon_validate
     *
     * @param validateModel {
     *                      "productId": "string",
     *                      "currency": "string"
     *                      }
     * @return {}
     */
    String validate(String validateModel);
}
