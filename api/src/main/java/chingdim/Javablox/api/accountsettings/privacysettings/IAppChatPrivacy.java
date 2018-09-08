package chingdim.Javablox.api.accountsettings.privacysettings;

/**
 * https://accountsettings.roblox.com/docs#/PrivacySettings
 */
public interface IAppChatPrivacy {

    /**
     * Get a user's app chat privacy setting
     * https://accountsettings.roblox.com/docs#!/PrivacySettings/get_v1_app_chat_privacy
     * @return {
     *   "appChatPrivacy": "string"
     * }
     */
    String getAppChatPrivacy();

    /**
     * Updates a user's app chat privacy setting
     * https://accountsettings.roblox.com/docs#!/PrivacySettings/post_v1_app_chat_privacy
     * @param model {
     *   "appChatPrivacy": "NoOne"
     * }
     * @return {}
     */
    String setAppChatPrivacy(String model);
}
