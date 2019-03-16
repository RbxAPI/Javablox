package io.github.rbxapi.javablox.api.avatar.avatar;

public interface AssetAvatar {

    /**
     * Removes the asset from the authenticated user's avatar
     * https://avatar.roblox.com/docs#!/Avatar/post_v1_avatar_assets_assetId_remove
     * @param assetId The asset id.
     * @return {
     *   "success": true
     * }
     */
    String removeAsset(int assetId);

    /**
     * Puts the asset on the authenticated user's avatar.
     * https://avatar.roblox.com/docs#!/Avatar/post_v1_avatar_assets_assetId_wear
     * @param assetId The asset id.
     * @return {
     *   "success": true
     * }
     */
    String wearAsset(int assetId);
}
