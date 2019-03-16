package io.github.rbxapi.javablox.api.auth;

/**
 * https://auth.roblox.com/docs#/Credentials
 */
public interface Credentials {
    /**
     * Checks if it is possible to send a verification message for the provided credentials.
     * <p>
     * https://auth.roblox.com/docs#!/Credentials/get_v2_credentials_verification
     *
     * @param credentialType  Credentials type {Roblox.Platform.Authentication.CredentialsType}.
     * @param credentialValue Credentials value.
     * @param password        Credentials password.
     * @return {
     * "canSend": true
     * }
     */
    String getVerification(String credentialType, String credentialValue, String password);

    /**
     * Sends a verification message to the provided credentials.
     * <p>
     * https://auth.roblox.com/docs#!/Credentials/post_v2_credentials_verification_send
     *
     * @param request Request model with a credential value, type, and password.
     * @return {}
     */
    String sendVerification(String request);
}
