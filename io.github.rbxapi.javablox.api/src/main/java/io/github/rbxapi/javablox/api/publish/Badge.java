package io.github.rbxapi.javablox.api.publish;

import java.io.File;

public interface Badge {

    /**
     * https://publish.roblox.com/docs#!/Badges/post_v1_badges_badgeId_icon
     *
     * @param badgeId Badge
     * @param file    File
     * @return Target ID
     */
    String updateBadgeIcon(double badgeId, File file);
}
