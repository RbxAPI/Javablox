package io.github.rbxapi.javablox.api.badges.badges;

public interface UserBadges {

    /**
     * Gets a list of badges a user has been awarded
     * https://badges.roblox.com/docs#!/Badges/get_v1_users_userId_badges
     *
     * @param userId    The user Id.
     * @param sortOrder (asc/desc) The order the results are sorted in.
     * @param limit     (enum) The amount of results per request.
     * @param cursor    The paging cursor for the previous or next page.
     * @return {
     * "previousPageCursor": "string",
     * "nextPageCursor": "string",
     * "data": [
     * {
     * "id": 0,
     * "name": "string",
     * "description": "string",
     * "enabled": true,
     * "iconImageId": 0,
     * "awarder": {
     * "id": 0,
     * "type": "Place"
     * },
     * "statistics": {
     * "pastDayAwardedCount": 0,
     * "awardedCount": 0,
     * "winRatePercentage": 0
     * },
     * "created": "2018-09-09T03:39:45.021Z",
     * "updated": "2018-09-09T03:39:45.021Z"
     * }
     * ]
     * }
     */
    String getAwardedBadgesList(int userId, String sortOrder, int limit, String cursor);
}
