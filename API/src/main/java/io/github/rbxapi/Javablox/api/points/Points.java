package io.github.rbxapi.javablox.api.points;

public interface Points {

    /**
     * https://points.roblox.com/docs#!/Points/get_v1_universes_universeId_users_userId_all_time
     * @param universeId Universe
     * @param userId User
     * @return Points data
     */
    String getAllTimePoints(double universeId, double userId);
}
