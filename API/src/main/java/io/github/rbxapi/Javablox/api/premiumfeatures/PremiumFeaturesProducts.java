package io.github.rbxapi.javablox.api.premiumfeatures;

public interface PremiumFeaturesProducts {

    /**
     * https://premiumfeatures.roblox.com/docs#!/PremiumFeaturesProducts/get_v1_products
     * @param typeName Type name(Optional), enum?
     * @return Products
     */
    String getProducts(String typeName);


}
