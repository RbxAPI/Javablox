package io.github.rbxapi.javablox.api.thumbnails;

public interface GroupEmblem {

    /**
     * https://thumbnails.roblox.com/docs#!/GroupEmblem/get_v1_groups_icons
     *
     * @param groupIds Group
     * @param size     Size(Default=150x150)
     * @param format   Format
     * @return data
     */
    String getGroupThumbnails(double[] groupIds, String size, int format);
}
