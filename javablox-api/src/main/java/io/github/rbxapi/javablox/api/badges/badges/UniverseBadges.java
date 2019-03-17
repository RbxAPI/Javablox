package io.github.rbxapi.javablox.api.badges.badges;

public interface UniverseBadges {

    /**
     * Gets badges by their awarding game.
     * https://badges.roblox.com/docs#!/Badges/get_v1_universes_universeId_badges
     *
     * @param universeId The universe Id.
     * @param sortOrder  (asc/desc)The order the results are sorted in.
     * @param limit      (enum) The amount of results per request.
     * @param cursor     The paging cursor for the previous or next page.
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
     * "created": "2018-09-09T03:39:45.011Z",
     * "updated": "2018-09-09T03:39:45.011Z",
     * "statistics": {
     * "pastDayAwardedCount": 0,
     * "awardedCount": 0,
     * "winRatePercentage": 0
     * },
     * "awardingUniverse": {
     * "id": 0,
     * "name": "string",
     * "rootPlaceId": 0
     * }
     * }
     * ]
     * }
     */
    String getAwardingGameBadge(int universeId, String sortOrder, int limit, String cursor);
}
