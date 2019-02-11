package io.github.rbxapi.javablox.api.accountsettings.tradesettings;

/**
 * https://accountsettings.roblox.com/docs#/TradeSettings
 */
public interface ITradePrivacy {
    /**
     * Get a user's trade privacy setting
     * https://accountsettings.roblox.com/docs#!/TradeSettings/get_v1_trade_privacy
     * @return {
     *   "tradePrivacy": "string"
     * }
     */
    String getTradePrivacy();

    /**
     * Updates a user's trade privacy setting
     * https://accountsettings.roblox.com/docs#!/TradeSettings/post_v1_trade_privacy
     * @param model {
     *   "tradePrivacy": "All"
     * }
     * @return {
     *   "tradePrivacy": "All",
     *   "inventoryPrivacy": "NoOne",
     *   "privacySettingResponse": "Success"
     * }
     */
    String setTradePrivacy(String model);
}
