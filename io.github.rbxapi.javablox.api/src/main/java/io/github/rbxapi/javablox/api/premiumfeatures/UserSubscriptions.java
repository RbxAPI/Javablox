package io.github.rbxapi.javablox.api.premiumfeatures;

public interface UserSubscriptions {

    /**
     * https://premiumfeatures.roblox.com/docs#!/PremiumFeaturesUsers/get_v1_users_userId_subscriptions
     *
     * @param userId User
     * @return Sub info
     */
    String getSub(double userId);

    /**
     * https://premiumfeatures.roblox.com/docs#!/PremiumFeaturesUsers/patch_v1_users_userId_subscriptions
     *
     * @param userId    User
     * @param productId Product
     * @return Sub info
     */
    String updateSub(double userId, int productId);
}
