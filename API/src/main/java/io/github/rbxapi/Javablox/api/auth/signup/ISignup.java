package io.github.rbxapi.javablox.api.auth.signup;

/**
 * https://auth.roblox.com/docs#/Signup
 */
public interface ISignup {

    /**
     * Endpoint for signing up a new user
     *
     * https://auth.roblox.com/docs#!/Signup/post_v2_signup
     * @param request {Roblox.Api.Authentication.Models.SignupRequest}
     * @return {
     *   "userId": 0
     * }
     */
    String signup(String request);
}
