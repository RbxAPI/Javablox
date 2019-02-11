package io.github.rbxapi.javablox.api.games;

public interface Game {

    /**
     * https://games.roblox.com/docs#!/Games/get_v2_groups_groupId_games
     * @param groupId Group ID
     * @param accessFilter Access Filter
     * @param sortOrder Sort Order
     * @param limit Limit
     * @param cursor Cursor
     * @return List of games
     */
    String getGroupGames(double groupId, String accessFilter, String sortOrder, int limit, String cursor);
}
