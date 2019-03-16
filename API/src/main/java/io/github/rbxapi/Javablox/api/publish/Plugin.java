package io.github.rbxapi.javablox.api.publish;

import java.io.File;

public interface Plugin {

    /**
     * https://publish.roblox.com/docs#!/Plugin/post_v1_plugins_pluginId_icon
     * @param pluginId Plugin
     * @param file File
     * @return Target ID
     */
    String updatePluginIcon(double pluginId, File file);
}
