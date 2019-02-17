package io.github.rbxapi.javablox.api.games;

public interface Favourite {
    /**
     * https://games.roblox.com/docs#!/Favorites/get_v1_games_universeId_favorites
     * @param universeId Universe ID
     * @return boolean
     */
    String getIsFavourite(double universeId);

    /**
     * https://games.roblox.com/docs#!/Favorites/post_v1_games_universeId_favorites
     * @param universeId Universe ID
     * @param request boolean
     * @return HTTP Status Code
     */
    String setIsFavourite(double universeId, String request);

    /**
     * https://games.roblox.com/docs#!/Favorites/get_v1_games_universeId_favorites_count
     * @param universeId Universe ID
     * @return Integer
     */
    String getFavouriteCount(double universeId);
}
