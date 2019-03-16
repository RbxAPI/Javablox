package io.github.rbxapi.javablox.api.games;

public interface Game {

    /**
     * https://games.roblox.com/docs#!/Games/get_v2_groups_groupId_games
     *
     * @param groupId      Group ID
     * @param accessFilter Access Filter
     * @param sortOrder    Sort Order
     * @param limit        Limit
     * @param cursor       Cursor
     * @return List of games
     */
    String getGroupGames(double groupId, String accessFilter, String sortOrder, int limit, String cursor);

    /**
     * https://games.roblox.com/docs#!/Games/get_v2_users_userId_games
     *
     * @param userId       User ID
     * @param accessFilter Access Filter
     * @param sortOrder    Sort Order enum
     * @param limit        item per page
     * @param cursor       Cursor
     * @return List of games
     */
    String getUserGames(double userId, String accessFilter, String sortOrder, int limit, String cursor);

    /**
     * https://games.roblox.com/docs#!/Games/get_v1_games
     *
     * @param universeIds Array of Universe IDs
     * @return List of game details
     */
    String getGameDetails(double[] universeIds);

    /**
     * https://games.roblox.com/docs#!/Games/get_v1_games_placeId_servers_serverType
     *
     * @param placeId    Place ID
     * @param serverType Server Type
     * @param sortOrder  Sort Order
     * @param limit      Limit
     * @param cursor     Cursor
     * @return Server details
     */
    String getGameServers(double placeId, String serverType, String sortOrder, int limit, String cursor);

    /**
     * https://games.roblox.com/docs#!/Games/get_v1_games_universeId_media
     *
     * @param universeId Universe ID
     * @return Game Media
     */
    String getGameMedia(double universeId);

    /**
     * https://games.roblox.com/docs#!/Games/get_v1_games_games_product_info
     *
     * @param universeIds A list of universe Ids. Cannot exceed a maximum of 100 IDs.
     * @return Product info
     */
    String getGameProductInfo(double[] universeIds);

    /**
     * https://games.roblox.com/docs#!/Games/get_v1_games_list
     *
     * @param sortToken                  Unknown sort token
     * @param gameFilter                 Unknown game filter
     * @param timeFilter                 Unknown time filter
     * @param genreFilter                Unknown genre filter
     * @param exclusiveStartId           Starting from?
     * @param sortOrder                  Sort Order in integer?
     * @param keyword                    Search keywords
     * @param startRows                  Starting row
     * @param maxRows                    Maximum rows
     * @param isKeywordSuggestionEnabled Enable Keyboard Suggestion?
     * @param contextCountryRegionId     Region ID
     * @param contextUniverseId          Universe ID
     * @return List of games
     */
    String getGameList(String sortToken, String gameFilter, String timeFilter, String genreFilter, double exclusiveStartId, int sortOrder, String keyword, int startRows, int maxRows, boolean isKeywordSuggestionEnabled, int contextCountryRegionId, double contextUniverseId);

    /**
     * https://games.roblox.com/docs#!/Games/get_v1_games_multiget_place_details
     *
     * @param placeIds Array of Place IDs
     * @return Place details
     */
    String getPlaceDetail(double[] placeIds);

    /**
     * https://games.roblox.com/docs#!/Games/get_v1_games_multiget_playability_status
     *
     * @param universeIds List of Universe IDs
     * @return Playabilities
     */
    String getUniversePlayability(double[] universeIds);

    /**
     * https://games.roblox.com/docs#!/Games/get_v1_games_recommendations_algorithm_algorithmName
     *
     * @param algorithmName The algorithm name of recommendations
     * @param paginationKey The key of a page, which includes the start row index and all other necessary information to query the data. This parameter is usually not needed for the first page.
     * @param maxRows       The requested number of rows.
     * @return Games
     */
    String getGameRecommendations(String algorithmName, String paginationKey, int maxRows);

    /**
     * https://games.roblox.com/docs#!/Games/get_v1_games_recommendations_game_universeId
     *
     * @param universeId    The universe to base recommendations on
     * @param paginationKey The key of a page, which includes the start row index and all other necessary information to query the data. This parameter is usually not needed for the first page.
     * @param maxRows       The requested number of rows.
     * @return Games
     */
    String getGameRecommendations(double universeId, String paginationKey, int maxRows);

    /**
     * https://games.roblox.com/docs#!/Games/get_v1_games_sorts
     *
     * @param gameSortsContext Enum
     * @return Sort
     */
    String getSorts(String gameSortsContext);
}
