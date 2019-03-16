package io.github.rbxapi.javablox.api.auth;

/**
 * https://auth.roblox.com/docs#/TwoStepVerification
 */
public interface TwoStepVerification {

    /**
     * Resends a two step verification code
     * <p>
     * https://auth.roblox.com/docs#!/TwoStepVerification/post_v2_twostepverification_resend
     *
     * @param request {
     *                "username": "string",
     *                "ticket": "string",
     *                "actionType": "Login"
     *                }
     * @return {
     * "mediaType": "Email",
     * "ticket": "string"
     * }
     */
    String resend(String request);

    /**
     * Verifies a two step verification code.
     * <p>
     * https://auth.roblox.com/docs#!/TwoStepVerification/post_v2_twostepverification_verify
     *
     * @param request {
     *                "username": "string",
     *                "ticket": "string",
     *                "code": "string",
     *                "rememberDevice": true,
     *                "actionType": "Login"
     *                }
     * @return {}
     */
    String verify(String request);
}
