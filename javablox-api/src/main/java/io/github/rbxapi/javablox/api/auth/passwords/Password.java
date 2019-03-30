package io.github.rbxapi.javablox.api.auth.passwords;

/**
 * https://auth.roblox.com/docs#/Passwords
 */
public interface Password {

    /**
     * Endpoint for checking if a password is valid
     * <p>
     * https://auth.roblox.com/docs#!/Passwords/get_v2_passwords_validate
     *
     * @param username The username.
     * @param password The password.
     * @return {
     * "status": "ValidPassword"
     * }
     */
    String validate(String username, String password);

    /**
     * Changes the password for the authenticated user
     * <p>
     * https://auth.roblox.com/docs#!/Passwords/post_v2_user_passwords_change
     *
     * @param request The request model including the current password, and the new password.
     * @return {}
     */
    String change(String request);
}
