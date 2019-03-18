package io.github.rbxapi.javablox.api.publish;

import java.io.File;

public interface GameThumbnail {

    /**
     * https://publish.roblox.com/docs#!/GameThumbnails/post_v1_games_gameId_thumbnail_image
     *
     * @param gameId Game
     * @param file   File
     * @return Target ID
     */
    String updateThumbnail(double gameId, File file);
}
