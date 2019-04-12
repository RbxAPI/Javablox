package io.github.rbxapi.javablox.api.accountsettings.email;

import java.util.concurrent.CompletableFuture;

/**
 * https://accountsettings.roblox.com/docs#!/Email
 */
public interface Email {

    /**
     * Gets the authenticated user's email address and verified status
     * https://accountsettings.roblox.com/docs#!/Email/get_v1_email
     *
     * @return {
     * "emailAddress": "string",
     * "verified": true
     * }
     */
    CompletableFuture<String> getEmail();

    /**
     * Updates the authenticated user's email address
     * https://accountsettings.roblox.com/docs#!/Email/post_v1_email
     *
     * @param requestBody {
     *                    "password": "string",
     *                    "emailAddress": "string"
     *                    }
     * @return {}
     */
    CompletableFuture<String> setEmail(String requestBody);

    /**
     * Send verify email to the authenticated user's email address
     * https://accountsettings.roblox.com/docs#!/Email/post_v1_email_verify
     *
     * @param request freeItem : Boolean
     * @return {}
     */
    CompletableFuture<String> sendVerifyEmail(String request);
}
