package io.github.rbxapi.Javablox.api.badges.badgeawards;


/**
 * https://badges.roblox.com/docs#!/BadgeAwards
 */
public interface IBadgeAwards {

    /**
     * Gets timestamps for when badges were awarded to a user
     * https://badges.roblox.com/docs#!/BadgeAwards/get_v1_users_userId_badges_awarded_dates
     * @param userId The user Id.
     * @param badgeIds The CSV of badge Ids.
     * @return {
     *   "data": [
     *     {
     *       "badgeId": 0,
     *       "awardedDate": "2018-09-09T03:39:45.027Z"
     *     }
     *   ]
     * }
     */
    String getAwardedDates(int userId, int[] badgeIds);

    /**
     * Removes a badge from the authenticated user.
     * https://badges.roblox.com/docs#!/BadgeAwards/delete_v1_user_badges_badgeId
     * @param badgeId The badge Id.
     * @return {}
     */
    String deleteBadge(int badgeId);
}
