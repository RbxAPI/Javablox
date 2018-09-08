package io.github.rbxapi.Javablox.api.auth.credentials;

/**
 * https://auth.roblox.com/docs#/Credentials
 */
public interface ICredentialsVerification {
    /**
     * Checks if it is possible to send a verification message for the provided credentials.
     *
     * https://auth.roblox.com/docs#!/Credentials/get_v2_credentials_verification
     * @param credentialType Credentials type {Roblox.Platform.Authentication.CredentialsType}.
     * @param credentialValue Credentials value.
     * @param password Credentials password.
     * @return {
     *   "canSend": true
     * }
     */
    String getVerification(String credentialType, String credentialValue, String password);

    /**
     * Sends a verification message to the provided credentials.
     *
     * https://auth.roblox.com/docs#!/Credentials/post_v2_credentials_verification_send
     * @param request Request model with a credential value, type, and password.
     * @return {}
     */
    String sendVerification(String request);
}
