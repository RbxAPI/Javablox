package io.github.rbxapi.javablox.api.catalog;

/**
 * https://catalog.roblox.com/docs#/Bundle
 */
public interface BundleCatalog {

    /**
     * Returns details about the given bundleId
     * https://catalog.roblox.com/docs#!/Bundle/get_v1_bundles_bundleId_details
     * @param bundleId integer
     * @return {
     *   "id": 0,
     *   "name": "string",
     *   "description": "string",
     *   "bundleType": "string",
     *   "items": [
     *     {
     *       "owned": true,
     *       "id": 0,
     *       "name": "string",
     *       "type": "string"
     *     }
     *   ],
     *   "creator": {
     *     "id": 0,
     *     "name": "string",
     *     "type": "string"
     *   },
     *   "product": {
     *     "id": 0,
     *     "type": "string",
     *     "isPublicDomain": true,
     *     "isForSale": true,
     *     "priceInRobux": 0
     *   }
     * }
     */
    String getBundleDetails(int bundleId);

    /**
     * Lists the bundles owned by a given user.
     * https://catalog.roblox.com/docs#!/Bundle/get_v1_bundles_owned
     * @param sortOrder (asc/desc) Sorted by bundle
     * @param limit (enum) The amount of results per request.
     * @param cursor The paging cursor for the previous or next page.
     * @return {
     *   "previousPageCursor": "string",
     *   "nextPageCursor": "string",
     *   "data": [
     *     {
     *       "id": 0,
     *       "name": "string",
     *       "bundleType": "string",
     *       "creator": {
     *         "id": 0,
     *         "name": "string",
     *         "type": "string"
     *       }
     *     }
     *   ]
     * }
     */
    String getOwnedBundles(String sortOrder, int limit, String cursor);

    /**
     * Unpacks a bundle and grants all of the associated items. It may take a few seconds for all items to be granted after the request finishes.
     * https://catalog.roblox.com/docs#!/Bundle/post_v1_bundles_bundleId_unpack
     *
     * @param bundleId Bundle Id
     * @return empty response
     */
    String unpackBundle(int bundleId);

}
