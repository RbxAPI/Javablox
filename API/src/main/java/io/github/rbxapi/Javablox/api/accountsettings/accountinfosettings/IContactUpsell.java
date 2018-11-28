package io.github.rbxapi.Javablox.api.accountsettings.accountinfosettings;

/**
 * https://accountsettings.roblox.com/docs#/AccountInfoSettings
 */
public interface IContactUpsell {
    /**
     * Determines if the contact (e.g. email or phone) upsell screen should be shown to the current user and gets data related to it
     * https://accountsettings.roblox.com/docs#!/AccountInfoSettings/get_v1_user_screens_contact_upsell
     * @return {
     *   "upsellScreenType": "None"
     * }
     */
    String getUpsell();

    /**
     * Suppresses the ContactUpsell screen for the authenticated user
     * https://accountsettings.roblox.com/docs#!/AccountInfoSettings/post_v1_user_screens_contact_upsell_suppress
     * @param suppress value
     * @return {}
     */
    String suppressUpsell(boolean suppress);
}
