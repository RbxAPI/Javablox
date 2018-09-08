package chingdim.Javablox.api.accountsettings.privacysettings;

/**
 * https://accountsettings.roblox.com/docs#!/PrivacySettings
 */
public interface IInventoryPrivacy {
    /**
     * Get a user's inventory privacy setting
     * https://accountsettings.roblox.com/docs#!/PrivacySettings/get_v1_inventory_privacy
     * @return {
     *   "inventoryPrivacy": "NoOne"
     * }
     */
    String getInventoryPrivacy();
}
