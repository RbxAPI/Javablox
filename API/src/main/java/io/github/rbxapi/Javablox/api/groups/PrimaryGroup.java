package io.github.rbxapi.javablox.api.groups;

public interface PrimaryGroup {
    /**
     * https://groups.roblox.com/docs#!/PrimaryGroup/get_v1_users_userId_groups_primary_role
     * @param userId User ID
     * @return Group
     */
    String getPrimaryGroup(double userId);

    /**
     * https://groups.roblox.com/docs#!/PrimaryGroup/delete_v1_user_groups_primary
     * @return Status code
     */
    String removePrimaryGroup();

    /**
     * https://groups.roblox.com/docs#!/PrimaryGroup/post_v1_user_groups_primary
     * @param request Integer Group ID
     * @return Status Code
     */
    String setPrimaryGroup(String request);
}
