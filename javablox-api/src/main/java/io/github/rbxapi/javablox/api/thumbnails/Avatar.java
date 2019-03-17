package io.github.rbxapi.javablox.api.thumbnails;

public interface Avatar {

    /**
     * https://thumbnails.roblox.com/docs#!/Avatar/get_v1_users_avatar
     *
     * @param userIds Users
     * @param size    Size(Default=100x100)
     * @param format  Format
     * @return data
     */
    String getAvatarFullBodyShots(double[] userIds, String size, int format);

    /**
     * https://thumbnails.roblox.com/docs#!/Avatar/get_v1_users_avatar_headshot
     *
     * @param userIds Users
     * @param size    Default 48x48
     * @param format  Format
     * @return data
     */
    String getAvatarHeadshots(double[] userIds, String size, int format);
}
