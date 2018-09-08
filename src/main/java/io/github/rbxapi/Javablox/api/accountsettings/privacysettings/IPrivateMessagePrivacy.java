package io.github.rbxapi.Javablox.api.accountsettings.privacysettings;

/**
 * https://accountsettings.roblox.com/docs#!/PrivacySettings
 */
public interface IPrivateMessagePrivacy {

    /**
     * Get a user's private message privacy setting
     * https://accountsettings.roblox.com/docs#!/PrivacySettings/get_v1_private_message_privacy
     * @return {
     *   "privateMessagePrivacy": "string"
     * }
     */
    String getPrivateMessagePrivacy();

    /**
     * Updates a user's private message privacy setting
     * https://accountsettings.roblox.com/docs#!/PrivacySettings/post_v1_private_message_privacy
     * @param model {
     *   "privateMessagePrivacy": "All"
     * }
     * @return {}
     */
    String setPrivateMessagePrivacy(String model);
}
