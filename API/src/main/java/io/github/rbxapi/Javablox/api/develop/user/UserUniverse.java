package io.github.rbxapi.javablox.api.develop.user;

public interface UserUniverse {

    /**
     * https://develop.roblox.com/docs#!/User/get_v1_user_universes
     * @param sortOrder Asc/Desc
     * @param limit Page limit
     * @param cursor cursor
     * @return Status Code
     */
    String getUniverses(String sortOrder, int limit, String cursor);
}
