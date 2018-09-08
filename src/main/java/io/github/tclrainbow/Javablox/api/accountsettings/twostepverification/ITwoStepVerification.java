package io.github.tclrainbow.Javablox.api.accountsettings.twostepverification;

/**
 * https://accountsettings.roblox.com/docs#/
 */
public interface ITwoStepVerification {

    /**
     * Retrieves the Two-Step Verification Setting
     * https://accountsettings.roblox.com/docs#!/TwoStepVerification/get_v2_twostepverification
     * @return enabled
     */
    String getTwoStepVerification();

    /**
     * Sets the Two-Step Verification Setting. Account password is required to disable 2SV.
     * https://accountsettings.roblox.com/docs#!/TwoStepVerification/post_v2_twostepverification
     * @param requestBody {
     *   "enabled": true,
     *   "password": "string"
     * }
     * @return {}
     */
    String setTwoStepVerification(String requestBody);

}
