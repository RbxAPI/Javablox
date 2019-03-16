package io.github.rbxapi.javablox.api.accountsettings.xbox;

/**
 * https://accountsettings.roblox.com/docs#/Xbox
 */
public interface Xbox {
    /**
     * Determines whether the username requested is valid.
     * https://accountsettings.roblox.com/docs#!/Xbox/get_v1_xbox_is_username_valid
     *
     * @param authorization header
     * @param signature     header
     * @param username      proposed username
     * @return {
     * "isValid": true,
     * "errorMessage": "string",
     * "errorCode": "UserNameValid"
     * }
     */
    String isUsernameValid(String authorization, String signature, String username);
}
