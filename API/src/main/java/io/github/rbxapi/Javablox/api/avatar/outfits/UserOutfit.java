package io.github.rbxapi.javablox.api.avatar.outfits;

public interface UserOutfit {

    /**
     * Gets details about the contents of an outfit
     * @param userOutfitId Outfit Id
     * @return {
     *   "id": 0,
     *   "name": "string",
     *   "assets": [
     *     {
     *       "id": 0,
     *       "name": "string",
     *       "assetType": {
     *         "id": 0,
     *         "name": "string"
     *       }
     *     }
     *   ],
     *   "bodyColors": {
     *     "headColorId": 0,
     *     "torsoColorId": 0,
     *     "rightArmColorId": 0,
     *     "leftArmColorId": 0,
     *     "rightLegColorId": 0,
     *     "leftLegColorId": 0
     *   },
     *   "scale": {
     *     "height": 0,
     *     "width": 0,
     *     "head": 0,
     *     "depth": 0,
     *     "proportion": 0,
     *     "bodyType": 0
     *   },
     *   "playerAvatarType": "string",
     *   "isEditable": true
     * }
     */
    String getUserOutfitDetails(int userOutfitId);

    /**
     * Deletes the outfit
     *
     * https://avatar.roblox.com/docs#!/Outfits/post_v1_outfits_userOutfitId_delete
     * @param userOutfitId The user outfit id
     * @return {
     *   "success": true
     * }
     */
    String deleteUserOutfit(int userOutfitId);

    /**
     * Updates the contents of the outfit
     * https://avatar.roblox.com/docs#!/Outfits/post_v1_outfits_userOutfitId_update
     * @param userOutfitId Outfit Id
     * @param outfitUpdateModel outfit model
     * @return {
     *   "success": true
     * }
     */
    String updateUserOutfit(int userOutfitId, String outfitUpdateModel);

    /**
     * Wears the outfit
     * https://avatar.roblox.com/docs#!/Outfits/post_v1_outfits_userOutfitId_wear
     * @param userOutfitId Outfit Id
     * @return {
     *   "invalidAssets": [
     *     {
     *       "id": 0,
     *       "name": "string",
     *       "assetType": {
     *         "id": 0,
     *         "name": "string"
     *       }
     *     }
     *   ],
     *   "invalidAssetIds": [
     *     0
     *   ],
     *   "success": true
     * }
     */
    String wearUserOutfit(int userOutfitId);
}
