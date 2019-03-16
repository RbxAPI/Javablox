package io.github.rbxapi.javablox.api.avatar.outfits;

/**
 * https://avatar.roblox.com/docs#/Outfits
 */
public interface Outfit {

    /**
     * Creates a new outfit
     * https://avatar.roblox.com/docs#!/Outfits/post_v1_outfits_create
     *
     * @param outfitUpdateModel {
     *                          "name": "string",
     *                          "bodyColors": {
     *                          "headColorId": 0,
     *                          "torsoColorId": 0,
     *                          "rightArmColorId": 0,
     *                          "leftArmColorId": 0,
     *                          "rightLegColorId": 0,
     *                          "leftLegColorId": 0
     *                          },
     *                          "assetIds": [
     *                          0
     *                          ],
     *                          "scale": {
     *                          "height": 0,
     *                          "width": 0,
     *                          "head": 0,
     *                          "depth": 0,
     *                          "proportion": 0,
     *                          "bodyType": 0
     *                          },
     *                          "playerAvatarType": "string"
     *                          }
     * @return {
     * "success": true
     * }
     */
    String create(String outfitUpdateModel);
}
