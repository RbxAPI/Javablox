package io.github.rbxapi.javablox.api.games;

public interface Vote {
    /**
     * https://games.roblox.com/docs#!/Votes/get_v1_games_universeId_votes_user
     * @param universeId Universe ID
     * @return User vote status on universe
     */
    String getUserVote(double universeId);

    /**
     * https://games.roblox.com/docs#!/Votes/get_v1_games_votes
     * @param universeIds Array of Universe IDs
     * @return Vote status of universes
     */
    String getUniverseVotes(double[] universeIds);

    /**
     * https://games.roblox.com/docs#!/Votes/patch_v1_games_universeId_user_votes
     * @param universeId Universe ID
     * @param requestBody Boolean
     * @return HTTP Status Code
     */
    String setUserVote(double universeId, String requestBody);
}
