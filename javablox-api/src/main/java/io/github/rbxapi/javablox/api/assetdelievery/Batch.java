package io.github.rbxapi.javablox.api.assetdelievery;

/**
 * https://assetdelivery.roblox.com/docs#!/Batch
 */
public interface Batch {
    /**
     * https://assetdelivery.roblox.com/docs#!/Batch/post_v1_assets_batch
     *
     * @param assetRequestItems [
     *                          {
     *                          "assetName": "string",
     *                          "assetType": "string",
     *                          "clientInsert": true,
     *                          "placeId": 0,
     *                          "requestId": "string",
     *                          "scriptInsert": true,
     *                          "serverPlaceId": 0,
     *                          "universeId": 0,
     *                          "accept": "string",
     *                          "encoding": "string",
     *                          "hash": "string",
     *                          "userAssetId": 0,
     *                          "assetId": 0,
     *                          "version": 0,
     *                          "assetVersionId": 0,
     *                          "modulePlaceId": 0
     *                          }
     *                          ]
     * @return [
     * {
     * "Location": "string",
     * "Errors": [
     * {
     * "Code": 0,
     * "Message": "string"
     * }
     * ],
     * "RequestId": "string",
     * "IsHashDynamic": true,
     * "IsCopyrightProtected": true
     * }
     * ]
     */
    String postBatchRequest(String assetRequestItems);
}
