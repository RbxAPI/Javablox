package io.github.rbxapi.javablox.api.develop;

public interface DeveloperProduct {

    /**
     * https://develop.roblox.com/docs#!/DeveloperProducts/post_v1_universes_universeId_developerproducts_productId_update
     *
     * @param universeId Universe ID
     * @param productId  Product ID
     * @param updateInfo Product Settings
     * @return Status Code
     */
    String set(double universeId, double productId, String updateInfo);
}
