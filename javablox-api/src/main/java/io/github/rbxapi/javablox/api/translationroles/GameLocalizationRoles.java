package io.github.rbxapi.javablox.api.translationroles;

public interface GameLocalizationRoles {

    /**
     * https://translationroles.roblox.com/docs#!/GameLocalizationRoles/get_v1_game_localization_roles_games_gameId_current_user_roles
     *
     * @param gameId Game
     * @return data
     */
    String getCurrentUserRoles(double gameId);

    /**
     * https://translationroles.roblox.com/docs#!/GameLocalizationRoles/get_v1_game_localization_roles_games_gameId_roles_role_assignees
     *
     * @param gameId Game
     * @param role   Unknown object type, expects to be a String. Role enum.
     * @return data
     */
    String getRoleAssignees(double gameId, String role);

    /**
     * https://translationroles.roblox.com/docs#!/GameLocalizationRoles/patch_v1_game_localization_roles_games_gameId
     *
     * @param gameId  Game
     * @param request Request JSON
     * @return Status code
     */
    String setUserRole(double gameId, String request);
}
