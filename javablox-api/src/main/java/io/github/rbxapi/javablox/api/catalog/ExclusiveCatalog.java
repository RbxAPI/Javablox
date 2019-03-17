package io.github.rbxapi.javablox.api.catalog;

/**
 * https://catalog.roblox.com/docs#/ExclusiveItems
 */
public interface ExclusiveCatalog {

    /**
     * Lists the exclusive catalog items for a particular app store
     * https://catalog.roblox.com/docs#!/ExclusiveItems/get_v1_exclusive_items_appStoreType_bundles
     *
     * @param appStoreType (enum) iOS/Android/etc.
     * @return {
     * "data": [
     * {
     * "id": 0,
     * "name": "string",
     * "description": "string",
     * "type": "string",
     * "priceInRobux": 0
     * }
     * ],
     * "total": 0
     * }
     */
    String getExclusiveCatalogList(String appStoreType);
}
