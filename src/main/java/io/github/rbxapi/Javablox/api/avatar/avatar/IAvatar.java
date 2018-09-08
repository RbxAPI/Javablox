package io.github.rbxapi.Javablox.api.avatar.avatar;

/**
 * https://avatar.roblox.com/docs#!/Avatar
 */
public interface IAvatar {

    /**
     * Returns details about the authenticated user's avatar
     *
     * https://avatar.roblox.com/docs#!/Avatar/get_v1_avatar
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
    String getAvatar();

    /**
     * Returns the business rules related to avatars\n
     *
     * BodyColorsPalette is a list of valid brickColors you can choose for your avatar. WearableAssetTypes contains a list of asset types with names, ids, and the maximum number that you can wear at a time. Does not include packages because they cannot be worn on your avatar directly. PlayerAvatarTypes are the types of avatars you can choose between.
     * @return {
     *   "playerAvatarTypes": [
     *     "R6"
     *   ],
     *   "scales": {},
     *   "wearableAssetTypes": [
     *     {
     *       "maxNumber": 0,
     *       "id": 0,
     *       "name": "string"
     *     }
     *   ],
     *   "bodyColorsPalette": [
     *     {
     *       "brickColorId": 0,
     *       "hexColor": "string",
     *       "name": "string"
     *     }
     *   ],
     *   "basicBodyColorsPalette": [
     *     {
     *       "brickColorId": 0,
     *       "hexColor": "string",
     *       "name": "string"
     *     }
     *   ],
     *   "minimumDeltaEBodyColorDifference": 0,
     *   "proportionsAndBodyTypeEnabledForUser": true,
     *   "defaultClothingAssetLists": {
     *     "defaultShirtAssetIds": [
     *       0
     *     ],
     *     "defaultPantAssetIds": [
     *       0
     *     ]
     *   },
     *   "bundlesEnabledForUser": true
     * }
     */
    String getAvatarRules();
}
