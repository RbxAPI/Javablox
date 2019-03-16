package io.github.rbxapi.javablox.api.groups;

public interface Wall {
    /**
     * https://groups.roblox.com/docs#!/Wall/get_v2_groups_groupId_wall_posts
     *
     * @param groupId   Group ID
     * @param sortOrder Enum
     * @param limit     Integer
     * @param cursor    String cursor
     * @return List of wall posts
     */
    String getWallPosts(double groupId, String sortOrder, int limit, String cursor);

    /**
     * https://groups.roblox.com/docs#!/Wall/post_v2_groups_groupId_wall_posts
     *
     * @param groupId Group ID
     * @param request Post
     * @return Status Code
     */
    String createPost(double groupId, String request);

    /**
     * https://groups.roblox.com/docs#!/Wall/delete_v1_groups_groupId_wall_posts_postId
     *
     * @param groupId Group ID
     * @param postId  Post ID
     * @return Status Code
     */
    String removePost(double groupId, double postId);

    /**
     * https://groups.roblox.com/docs#!/Wall/delete_v1_groups_groupId_wall_users_userId_posts
     *
     * @param groupId Group ID
     * @param userId  User ID
     * @return Status Code
     */
    String removeUserPosts(double groupId, double userId);
}
