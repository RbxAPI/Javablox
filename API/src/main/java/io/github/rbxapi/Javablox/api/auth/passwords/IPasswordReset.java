package io.github.rbxapi.javablox.api.auth.passwords;

/**
 * https://auth.roblox.com/docs#!/Passwords
 */
public interface IPasswordReset {

    /**
     * Resets a password for a user that belongs to the password reset ticket
     *
     * https://auth.roblox.com/docs#!/Passwords/post_v2_passwords_reset
     * @param request The request model including the ticket, and new password.
     * @return {}
     */
    String resetByTicket(String request);

    /**
     * Sends a password reset challenge to the specified target.
     *
     * https://auth.roblox.com/docs#!/Passwords/post_v2_passwords_reset_send
     * @param request The request model containing the {Roblox.Web.Authentication.Recovery.TransmissionType} and a target.
     * @return {
     *   "nonce": "string",
     *   "transmissionType": "Sms"
     * }
     */
    String sendChallenge(String request);

    /**
     * Verifies a challenge solution
     *
     * https://auth.roblox.com/docs#!/Passwords/post_v2_passwords_reset_verify
     * @param request The request model containing the nonce and the solution. {Roblox.Api.Authentication.PasswordResetVerificationRequest}
     * @return {
     *   "userTickets": [
     *     {
     *       "user": {
     *         "userId": 0,
     *         "username": "string"
     *       },
     *       "ticket": "string"
     *     }
     *   ]
     * }
     */
    String verifyChallenge(String request);
}
