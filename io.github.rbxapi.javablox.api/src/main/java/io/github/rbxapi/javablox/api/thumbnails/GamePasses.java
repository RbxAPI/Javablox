package io.github.rbxapi.javablox.api.thumbnails;

public interface GamePasses {

    /**
     * https://thumbnails.roblox.com/docs#!/GamePasses/get_v1_game_passes
     *
     * @param gamePassIds Game Passes
     * @param size        Size
     * @param format      Format
     * @return data
     */
    String getGamePassThumbnails(double[] gamePassIds, String size, int format);
}
