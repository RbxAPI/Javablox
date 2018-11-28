package io.github.rbxapi.Javablox.api.auth.authentication;

/**
 * https://auth.roblox.com/docs#/Authentication
 */
public interface IAuthentication {

    /**
     * Authenticates a user
     *
     * https://auth.roblox.com/docs#!/Authentication/post_v2_login
     * @param request {Roblox.Api.Authentication.Models.LoginRequest}
     * @return {
     *   "user": {
     *     "id": 0,
     *     "name": "string"
     *   },
     *   "twoStepVerificationData": {
     *     "mediaType": "Email",
     *     "ticket": "string"
     *   }
     * }
     */
    String login(String request);

    /**
     * Destroys the current authentication session
     *
     * https://auth.roblox.com/docs#!/Authentication/post_v2_logout
     * @return {}
     */
    String logout();
}
