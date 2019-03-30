package io.github.rbxapi.javablox.api.auth;

/**
 * https://auth.roblox.com/docs#/Usernames
 */
public interface Usernames {

    /**
     * Endpoint for checking if a username is valid
     * <p>
     * https://auth.roblox.com/docs#!/Usernames/get_v2_usernames_validate
     *
     * @param username The username.
     * @param birthday Birthday
     * @return {
     * "status": "UserNameValid"
     * }
     */
    String validate(String username, String birthday);
}
