package io.github.rbxapi.javablox.api.billing.gamecard;

/**
 * https://billing.roblox.com/docs#/Gamecard
 */
public interface IGamecardBilling {

    /**
     * Redeem gamecards for assets and credits
     * https://billing.roblox.com/docs#!/Gamecard/post_v1_gamecard_redeem
     * @param redemptionRequest {
     *   "pinCode": "string"
     * }
     * @return {
     *   "balance": "string",
     *   "successMsg": "string",
     *   "successSubText": "string",
     *   "bonusMsg": "string",
     *   "error": "string",
     *   "errorMsg": "string"
     * }
     */
    String redeem(String redemptionRequest);

    /**
     * Reverse a game card that was already redeemed
     * https://billing.roblox.com/docs#!/Gamecard/post_v1_gamecard_reverse
     * @param request {
     *   "PinCode": "string",
     *   "UserId": 0
     * }
     * @return {}
     */
    String reverse(String request);
}
