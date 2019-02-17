package io.github.rbxapi.javablox.api.groups;

public interface Wall {
    /**
     * https://groups.roblox.com/docs#!/Wall/get_v2_groups_groupId_wall_posts
     * @param groupId Group ID
     * @param sortOrder Enum
     * @param limit Integer
     * @param cursor String cursor
     * @return List of wall posts
     */
    String getWallPosts(double groupId, String sortOrder, int limit, String cursor);

    /**
     * https://groups.roblox.com/docs#!/Wall/post_v2_groups_groupId_wall_posts
     * @param groupId Group ID
     * @param request Post
     * @return Status Code
     */
    String createPost(double groupId, String request);
}
