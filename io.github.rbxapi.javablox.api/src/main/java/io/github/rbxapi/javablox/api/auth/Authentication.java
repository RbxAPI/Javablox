package io.github.rbxapi.javablox.api.auth;

/**
 * https://auth.roblox.com/docs#/Authentication
 */
public interface Authentication {

    /**
     * Authenticates a user
     * <p>
     * https://auth.roblox.com/docs#!/Authentication/post_v2_login
     *
     * @param request {Roblox.Api.Authentication.Models.LoginRequest}
     * @return {
     * "user": {
     * "id": 0,
     * "name": "string"
     * },
     * "twoStepVerificationData": {
     * "mediaType": "Email",
     * "ticket": "string"
     * }
     * }
     */
    String login(String request);

    /**
     * Destroys the current authentication session
     * <p>
     * https://auth.roblox.com/docs#!/Authentication/post_v2_logout
     *
     * @return {}
     */
    String logout();
}
