package io.github.rbxapi.javablox.api.gameinternationalization;

public interface NameDescription {
    /**
     * https://gameinternationalization.roblox.com/docs#!/NameDescription/get_v1_name_description_games_gameId
     *
     * @param gameId Game ID
     * @return Details
     */
    String getNameDescription(double gameId);

    /**
     * https://gameinternationalization.roblox.com/docs#!/NameDescription/patch_v1_name_description_games_gameId
     *
     * @param gameId  Game ID
     * @param request Request body
     * @return JSON status body
     */
    String setNameDescription(double gameId, String request);
}
