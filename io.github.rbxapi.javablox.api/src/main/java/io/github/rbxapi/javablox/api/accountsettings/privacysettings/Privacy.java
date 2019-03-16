package io.github.rbxapi.javablox.api.accountsettings.privacysettings;

/**
 * https://accountsettings.roblox.com/docs#/PrivacySettings
 */
public interface Privacy {

    /**
     * Gets a user's privacy settings
     * https://accountsettings.roblox.com/docs#!/PrivacySettings/get_v1_privacy
     *
     * @return {
     * "phoneDiscovery": "NoOne"
     * }
     */
    String getPrivacySetting();

    /**
     * Updates a user's privacy settings.
     * https://accountsettings.roblox.com/docs#!/PrivacySettings/patch_v1_privacy
     *
     * @param UpdatePrivacyRequest {
     *                             "phoneDiscovery": "NoOne"
     *                             }
     * @return {}
     */
    String patchPrivacySetting(String UpdatePrivacyRequest);

    /**
     * Gets a user's privacy settings info.
     * https://accountsettings.roblox.com/docs#!/PrivacySettings/get_v1_privacy_info
     *
     * @return {
     * "isPhoneDiscoveryEnabled": true
     * }
     */
    String getPrivacyInfo();
}
