package io.github.rbxapi.javablox.api.thumbnails;

public interface Badges {

    /**
     * https://thumbnails.roblox.com/docs#!/Badges/get_v1_badges_icons
     *
     * @param badgeIds Badges
     * @param size     Size, pixels.
     * @param format   File formats, should be PNG only.
     * @return data
     */
    String getBadgeThumbnails(double[] badgeIds, String size, int format);
}
