package io.github.rbxapi.javablox.api.inventory;

public interface Inventory {
    /**
     * https://inventory.roblox.com/docs#!/Inventory/get_v1_users_userId_assets_collectibles
     *
     * @param userId    User ID
     * @param assetType Enum
     * @param sortOrder Enum
     * @param limit     Integer
     * @param cursor    Cursor
     * @return Collectible Assets
     */
    String getCollectibles(int userId, String assetType, String sortOrder, int limit, String cursor);

    /**
     * https://inventory.roblox.com/docs#!/Inventory/get_v1_users_userId_items_itemType_itemTargetId
     *
     * @param userId       User ID
     * @param itemType     Enum
     * @param itemTargetId ID of the item in question
     * @return Items
     */
    String getOwnedItemsByType(double userId, String itemType, double itemTargetId);
}
