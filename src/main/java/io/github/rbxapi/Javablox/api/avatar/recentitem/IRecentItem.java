package io.github.rbxapi.Javablox.api.avatar.recentitem;

/**
 * https://avatar.roblox.com/docs#/RecentItem
 */
public interface IRecentItem {

    /**
     * Returns a list of recent items.
     * Recent items can be Assets or Outfits.
     * https://avatar.roblox.com/docs#!/RecentItem/get_v1_recent_items_recentItemListType_list
     * @param recentItemListType enum
     * @return {
     *   "data": [
     *     {
     *       "id": 0,
     *       "name": "string",
     *       "type": "Asset",
     *       "assetType": {
     *         "id": 0,
     *         "name": "string"
     *       },
     *       "isEditable": true
     *     }
     *   ],
     *   "total": 0
     * }
     */
    String getRecentItemList(String recentItemListType);
}
