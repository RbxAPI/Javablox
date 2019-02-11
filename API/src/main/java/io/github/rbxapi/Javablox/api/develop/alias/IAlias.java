package io.github.rbxapi.javablox.api.develop.alias;

public interface IAlias {

    /**
     * https://develop.roblox.com/docs#!/Aliases/post_v1_universes_universeId_aliases
     * @param universeId Universe ID
     * @param request request
     * @return Status Code
     */
    String createAlias(double universeId, String request);

    /**
     * https://develop.roblox.com/docs#!/Aliases/delete_v1_universes_universeId_aliases_name
     * @param universeId Universe ID
     * @param name Alias Name
     * @return Status Code
     */
    String deleteAlias(double universeId, String name);

    /**
     * https://develop.roblox.com/docs#!/Aliases/patch_v1_universes_universeId_aliases_name
     * @param universeId Universe ID
     * @param name Alias Name
     * @param request Alias Settings
     * @return Status Code
     */
    String setAlias(double universeId, String name, String request);
}
