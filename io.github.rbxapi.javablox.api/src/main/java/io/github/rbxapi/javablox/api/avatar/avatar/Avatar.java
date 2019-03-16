package io.github.rbxapi.javablox.api.avatar.avatar;

/**
 * https://avatar.roblox.com/docs#!/Avatar
 */
public interface Avatar {

    /**
     * Returns details about the authenticated user's avatar
     * <p>
     * https://avatar.roblox.com/docs#!/Avatar/get_v1_avatar
     *
     * @return {
     * "scales": {
     * "height": 0,
     * "width": 0,
     * "head": 0,
     * "depth": 0,
     * "proportion": 0,
     * "bodyType": 0
     * },
     * "playerAvatarType": "R6",
     * "bodyColors": {
     * "headColorId": 0,
     * "torsoColorId": 0,
     * "rightArmColorId": 0,
     * "leftArmColorId": 0,
     * "rightLegColorId": 0,
     * "leftLegColorId": 0
     * },
     * "assets": [
     * {
     * "id": 0,
     * "name": "string",
     * "assetType": {
     * "id": 0,
     * "name": "string"
     * }
     * }
     * ],
     * "defaultShirtApplied": true,
     * "defaultPantsApplied": true
     * }
     */
    String getAvatar();

    /**
     * Returns the business rules related to avatars\n
     * <p>
     * BodyColorsPalette is a list of valid brickColors you can choose for your avatar. WearableAssetTypes contains a list of asset types with names, ids, and the maximum number that you can wear at a time. Does not include packages because they cannot be worn on your avatar directly. PlayerAvatarTypes are the types of avatars you can choose between.
     *
     * @return {
     * "playerAvatarTypes": [
     * "R6"
     * ],
     * "scales": {},
     * "wearableAssetTypes": [
     * {
     * "maxNumber": 0,
     * "id": 0,
     * "name": "string"
     * }
     * ],
     * "bodyColorsPalette": [
     * {
     * "brickColorId": 0,
     * "hexColor": "string",
     * "name": "string"
     * }
     * ],
     * "basicBodyColorsPalette": [
     * {
     * "brickColorId": 0,
     * "hexColor": "string",
     * "name": "string"
     * }
     * ],
     * "minimumDeltaEBodyColorDifference": 0,
     * "proportionsAndBodyTypeEnabledForUser": true,
     * "defaultClothingAssetLists": {
     * "defaultShirtAssetIds": [
     * 0
     * ],
     * "defaultPantAssetIds": [
     * 0
     * ]
     * },
     * "bundlesEnabledForUser": true
     * }
     */
    String getAvatarRules();

    /**
     * Requests the authenticated user's thumbnail be redrawn
     * https://avatar.roblox.com/docs#!/Avatar/post_v1_avatar_redraw_thumbnail
     *
     * @return {}
     */
    String redrawThumbnail();

    /**
     * Sets the authenticated user's body colors
     * https://avatar.roblox.com/docs#!/Avatar/post_v1_avatar_set_body_colors
     *
     * @param bodyColorsModel {
     *                        "headColorId": 0,
     *                        "torsoColorId": 0,
     *                        "rightArmColorId": 0,
     *                        "leftArmColorId": 0,
     *                        "rightLegColorId": 0,
     *                        "leftLegColorId": 0
     *                        }
     * @return {
     * "success": true
     * }
     */
    String setBodyColors(String bodyColorsModel);

    /**
     * Sets the authenticated user's player avatar type (e.g. R6 or R15)
     * https://avatar.roblox.com/docs#!/Avatar/post_v1_avatar_set_player_avatar_type
     *
     * @param playerAvatarTypeModel {
     *                              "playerAvatarType": "R6"
     *                              }
     * @return {
     * "success": true
     * }
     */
    String setAvatarType(String playerAvatarTypeModel);

    /**
     * Sets the authenticated user's scales
     * https://avatar.roblox.com/docs#!/Avatar/post_v1_avatar_set_scales
     *
     * @param scalesModel {
     *                    "height": 0,
     *                    "width": 0,
     *                    "head": 0,
     *                    "depth": 0,
     *                    "proportion": 0,
     *                    "bodyType": 0
     *                    }
     * @return {
     * "success": true
     * }
     */
    String setScales(String scalesModel);

    /**
     * Sets the avatar's current assets to the list
     * Only allows items that you own, are not expired, and are wearable asset types. Any assets being worn before this method is called are automatically removed.
     * <p>
     * https://avatar.roblox.com/docs#!/Avatar/post_v1_avatar_set_wearing_assets
     *
     * @param assetIdsModel {
     *                      "assetIds": [
     *                      0
     *                      ]
     *                      }
     * @return {
     * "invalidAssets": [
     * {
     * "id": 0,
     * "name": "string",
     * "assetType": {
     * "id": 0,
     * "name": "string"
     * }
     * }
     * ],
     * "invalidAssetIds": [
     * 0
     * ],
     * "success": true
     * }
     */
    String setWearingAssets(String assetIdsModel);
}
