package io.github.rbxapi.Javablox.api.auth.passwords;

/**
 * https://auth.roblox.com/docs#/Passwords
 */
public interface IPassword {

    /**
     * Endpoint for checking if a password is valid
     *
     * https://auth.roblox.com/docs#!/Passwords/get_v2_passwords_validate
     * @param username The username.
     * @param password The password.
     * @return {
     *   "status": "ValidPassword"
     * }
     */
    String validate(String username, String password);

    /**
     * Changes the password for the authenticated user
     *
     * https://auth.roblox.com/docs#!/Passwords/post_v2_user_passwords_change
     * @param request The request model including the current password, and the new password.
     * @return {}
     */
    String change(String request);
}
