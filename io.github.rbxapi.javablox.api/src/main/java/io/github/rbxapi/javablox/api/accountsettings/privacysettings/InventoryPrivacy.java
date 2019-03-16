package io.github.rbxapi.javablox.api.accountsettings.privacysettings;

/**
 * https://accountsettings.roblox.com/docs#!/PrivacySettings
 */
public interface InventoryPrivacy {
    /**
     * Get a user's inventory privacy setting
     * https://accountsettings.roblox.com/docs#!/PrivacySettings/get_v1_inventory_privacy
     *
     * @return {
     * "inventoryPrivacy": "NoOne"
     * }
     */
    String getInventoryPrivacy();

    /**
     * Updates a user's inventory privacy setting
     * https://accountsettings.roblox.com/docs#!/PrivacySettings/post_v1_inventory_privacy
     *
     * @param model {
     *              "inventoryPrivacy": "NoOne"
     *              }
     * @return {
     * "inventoryPrivacy": "NoOne",
     * "tradePrivacy": "All",
     * "privacySettingResponse": "Success"
     * }
     */
    String setInventoryPrivacy(String model);
}
