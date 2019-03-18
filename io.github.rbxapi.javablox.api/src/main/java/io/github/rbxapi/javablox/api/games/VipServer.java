package io.github.rbxapi.javablox.api.games;

public interface VipServer {
    /**
     * https://games.roblox.com/docs#!/VipServers/get_v1_vip_servers_id
     *
     * @param id ID of the VIP server
     * @return VIP server
     */
    String getVipServer(double id);

    /**
     * https://games.roblox.com/docs#!/VipServers/patch_v1_vip_servers_id
     *
     * @param id      Server ID
     * @param request Update body
     * @return HTTP Status Code
     */
    String updateVipServer(double id, String request);

    /**
     * https://games.roblox.com/docs#!/VipServers/post_v1_games_vip_servers_universeId
     *
     * @param universeId  Universe ID
     * @param requestBody Request Body
     * @return Vip server object
     */
    String createVipServer(double universeId, String requestBody);

    /**
     * https://games.roblox.com/docs#!/VipServers/patch_v1_vip_servers_id_permissions
     *
     * @param id      VIP Server ID
     * @param request Update object
     * @return Updated permission
     */
    String setPermission(double id, String request);

    /**
     * https://games.roblox.com/docs#!/VipServers/patch_v1_vip_servers_id_subscription
     *
     * @param id      VIP Server ID
     * @param request Subscription body
     * @return Updated subscription body
     */
    String setSubscription(double id, String request);
}
