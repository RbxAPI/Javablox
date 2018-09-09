package io.github.rbxapi.Javablox.api.badges.badges;

/**
 * https://badges.roblox.com/docs#/Badges
 */
public interface IBadges {

    /**
     * Gets badge information by the badge Id
     * https://badges.roblox.com/docs#!/Badges/get_v1_badges_badgeId
     *
     * @param badgeId The badge Id.
     * @return {
     *   "id": 0,
     *   "name": "string",
     *   "description": "string",
     *   "enabled": true,
     *   "iconImageId": 0,
     *   "created": "2018-09-09T03:39:44.993Z",
     *   "updated": "2018-09-09T03:39:44.993Z",
     *   "statistics": {
     *     "pastDayAwardedCount": 0,
     *     "awardedCount": 0,
     *     "winRatePercentage": 0
     *   },
     *   "awardingUniverse": {
     *     "id": 0,
     *     "name": "string",
     *     "rootPlaceId": 0
     *   }
     * }
     */
    String getBadgeInfo(int badgeId);

    /**
     * Updates badge configuration
     * https://badges.roblox.com/docs#!/Badges/patch_v1_badges_badgeId
     *
     * @param badgeId The badge Id.
     * @param request {
     *   "name": "string",
     *   "description": "string",
     *   "enabled": true
     * }
     * @return {}
     */
    String patchBadgeConfig(int badgeId, String request);
}
