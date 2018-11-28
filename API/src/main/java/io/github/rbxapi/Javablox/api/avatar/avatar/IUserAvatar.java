package io.github.rbxapi.Javablox.api.avatar.avatar;

public interface IUserAvatar {

    /**
     * Returns details about a specified user's avatar.
     * https://avatar.roblox.com/docs#!/Avatar/get_v1_users_userId_avatar
     * @param userId integer
     * @return {
     *   "scales": {
     *     "height": 0,
     *     "width": 0,
     *     "head": 0,
     *     "depth": 0,
     *     "proportion": 0,
     *     "bodyType": 0
     *   },
     *   "playerAvatarType": "R6",
     *   "bodyColors": {
     *     "headColorId": 0,
     *     "torsoColorId": 0,
     *     "rightArmColorId": 0,
     *     "leftArmColorId": 0,
     *     "rightLegColorId": 0,
     *     "leftLegColorId": 0
     *   },
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
     *   "defaultShirtApplied": true,
     *   "defaultPantsApplied": true
     * }
     */
    String getUserAvatar(int userId);

    /**
     * Gets a list of asset ids that the user is currently wearing
     * https://avatar.roblox.com/docs#!/Avatar/get_v1_users_userId_currently_wearing
     * @param UserId The user Id
     * @return {
     *   "assetIds": [
     *     0
     *   ]
     * }
     */
    String getUserCurrentlyWearing(int UserId);

    /**
     * Gets a list of outfits for the specified user
     *
     * https://avatar.roblox.com/docs#!/Avatar/get_v1_users_userId_outfits
     * @param UserId The user id
     * @param page The page number
     * @param itemsPerPage The max number of outfits that can be returned
     * @return {
     *   "data": [
     *     {
     *       "id": 0,
     *       "name": "string",
     *       "isEditable": true
     *     }
     *   ],
     *   "total": 0
     * }
     */
    String getUserOutfit(int UserId, int page, int itemsPerPage);
}
