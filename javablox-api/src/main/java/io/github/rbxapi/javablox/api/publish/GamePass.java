package io.github.rbxapi.javablox.api.publish;

import java.io.File;

public interface GamePass {

    /**
     * https://publish.roblox.com/docs#/
     *
     * @param gamePassId Game Pass
     * @param file       File
     * @return Target ID
     */
    String updateGamePassIcon(double gamePassId, File file);
}
