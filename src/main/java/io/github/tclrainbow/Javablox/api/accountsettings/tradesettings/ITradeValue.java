package io.github.tclrainbow.Javablox.api.accountsettings.tradesettings;

/**
 * https://accountsettings.roblox.com/docs#/TradeSettings
 */
public interface ITradeValue {
    /**
     * Get a user's trade quality filter setting
     * https://accountsettings.roblox.com/docs#!/TradeSettings/get_v1_trade_value
     * @return {
     *   "tradeValue": "string"
     * }
     */
    String getTradeValue();

    /**
     * Updates a user's trade quality filter setting
     * https://accountsettings.roblox.com/docs#!/TradeSettings/post_v1_trade_value
     * @param model {
     *   "tradeValue": "None"
     * }
     * @return {}
     */
    String setTradeValue(String model);
}
