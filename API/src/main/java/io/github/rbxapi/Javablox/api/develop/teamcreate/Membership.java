package io.github.rbxapi.javablox.api.develop.teamcreate;

public interface Membership {

    /**
     * https://develop.roblox.com/docs#!/TeamCreate/delete_v1_universes_universeId_teamcreate_memberships
     * @param universeId universe Id
     * @param request user Id JSON
     * @return status code
     */
    String removeUser(double universeId, String request);

    /**
     * https://develop.roblox.com/docs#!/TeamCreate/get_v1_universes_universeId_teamcreate_memberships
     * @param universeId universe ID
     * @param sortOrder asc/desc
     * @param limit limit of page
     * @param cursor cursor
     * @return status code
     */
    String getUsers(double universeId, String sortOrder, int limit, String cursor);

    /**
     * https://develop.roblox.com/docs#!/TeamCreate/post_v1_universes_universeId_teamcreate_memberships
     * @param universeId universe ID
     * @param request userId JSON
     * @return status code
     */
    String addUser(double universeId, String request);

    /**
     * https://develop.roblox.com/docs#!/TeamCreate/get_v1_user_teamcreate_memberships
     * @param sortOrder asc/desc
     * @param limit page size
     * @param cursor cursor
     * @return status code
     */
    String getUniverses(String sortOrder, int limit, String cursor);
}
