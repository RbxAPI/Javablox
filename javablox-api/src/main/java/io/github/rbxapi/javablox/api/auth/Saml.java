package io.github.rbxapi.javablox.api.auth;

/**
 * https://auth.roblox.com/docs#!/Saml
 */
public interface Saml {

    /**
     * **Note: ** This endpoint is exceptional for SAML which is XML-based. Most Apis should not return XML.
     * <p>
     * Gets the SAML2 metadata XML.
     * <p>
     * https://auth.roblox.com/docs#!/Saml/get_v2_saml_metadata
     *
     * @return XML
     */
    String getMetadata();

    /**
     * **Note: ** This endpoint is exceptional for SAML which is XML-based. Most Apis should not return XML.
     * <p>
     * Authenticates a user for a service through SAML2
     * <p>
     * https://auth.roblox.com/docs#!/Saml/post_v2_saml_login
     *
     * @return {}
     */
    String login();
}
