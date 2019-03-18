package io.github.rbxapi.javablox.api.develop.user;

public interface StudioData {

    /**
     * https://develop.roblox.com/docs#!/User/get_v1_user_studiodata
     *
     * @param clientKey A Key to find this data under. Optional.
     * @return Data
     */
    String getData(String clientKey);

    /**
     * https://develop.roblox.com/docs#!/User/post_v1_user_studiodata
     *
     * @param data      JSON obj
     * @param clientKey A Key to find this data under. Optional.
     * @return HTTP Status Code
     */
    String saveData(String data, String clientKey);
}
