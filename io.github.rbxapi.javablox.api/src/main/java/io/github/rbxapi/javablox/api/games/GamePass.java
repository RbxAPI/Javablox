package io.github.rbxapi.javablox.api.games;

public interface GamePass {
    /**
     * https://games.roblox.com/docs#!/GamePasses/get_v1_games_universeId_game_passes
     *
     * @param universeId Universe ID
     * @param sortOrder  SortOrder enum
     * @param limit      Integer
     * @param cursor     String
     * @return List of Game Passes
     */
    String getGamePasses(double universeId, String sortOrder, int limit, String cursor);
}
