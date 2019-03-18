package io.github.rbxapi.javablox.api.inventory;

public interface Asset {
    /**
     * https://inventory.roblox.com/docs#!/Assets/get_v2_recommendations_assetTypeId
     *
     * @param assetTypeId    Asset Type ID
     * @param numItems       The number of recommended items to return.
     * @param contextAssetId Context
     * @param thumbWidth     Width
     * @param thumbHeight    Height
     * @return Asset
     */
    String getRecommendedAssets(int assetTypeId, int numItems, double contextAssetId, int thumbWidth, int thumbHeight);

    /**
     * https://inventory.roblox.com/docs#!/Assets/get_v1_assets_assetId_owners
     *
     * @param assetId   Asset ID
     * @param sortOrder Enum
     * @param limit     Integer
     * @param cursor    String
     * @return Owners
     */
    String getAssetOwners(double assetId, String sortOrder, int limit, String cursor);

    /**
     * https://inventory.roblox.com/docs#!/Assets/get_v1_packages_packageID_assets
     *
     * @param packageId Package ID
     * @return Assets
     */
    String getPackageAssets(double packageId);
}
