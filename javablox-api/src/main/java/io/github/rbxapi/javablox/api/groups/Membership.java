package io.github.rbxapi.javablox.api.groups;

public interface Membership {
    /**
     * https://groups.roblox.com/docs#!/Membership/get_v1_groups_groupId_membership
     *
     * @param groupId Group ID
     * @return Group information
     */
    String getMembership(double groupId);

    /**
     * https://groups.roblox.com/docs#!/Membership/get_v1_groups_groupId_roles
     *
     * @param groupId Group ID
     * @return Group roles
     */
    String getRoles(double groupId);

    /**
     * https://groups.roblox.com/docs#!/Membership/get_v1_groups_groupId_roles_roleSetId_users
     *
     * @param groupId   Group ID
     * @param roleSetId Role ID
     * @param sortOrder Enum
     * @param limit     Limit
     * @param cursor    String
     * @return Users
     */
    String getRoleUsers(int groupId, int roleSetId, String sortOrder, int limit, String cursor);

    /**
     * https://groups.roblox.com/docs#!/Membership/get_v1_user_groups_pending
     *
     * @return Groups
     */
    String getPendingGroups();

    /**
     * https://groups.roblox.com/docs#!/Membership/get_v1_users_userId_group_membership_status
     *
     * @param userId User ID
     * @return Group info
     */
    String getMembershipStatus(int userId);

    /**
     * https://groups.roblox.com/docs#!/Membership/get_v1_users_userId_groups_roles
     *
     * @param userId User ID
     * @return Roles that the user has
     */
    String getUserRoles(double userId);

    /**
     * https://groups.roblox.com/docs#!/Membership/post_v1_groups_groupId_claim_ownership
     *
     * @param groupId Group ID
     * @return Status Code
     */
    String claimOwnership(double groupId);

    /**
     * https://groups.roblox.com/docs#!/Membership/post_v1_groups_groupId_users
     *
     * @param groupId Group ID
     * @return Status Code
     */
    String join(int groupId);

    /**
     * <p>This is either decline or cancels a group join request.</p>
     * https://groups.roblox.com/docs#!/Membership/delete_v1_groups_groupId_join_requests_users_userId
     *
     * @param groupId Group ID
     * @param userId  User ID
     * @return Status Code
     */
    String removeJoinRequest(double groupId, double userId);

    /**
     * <p>Unlike removeJoinRequest(), this method requires the user to exist in the group. </p>
     * https://groups.roblox.com/docs#!/Membership/delete_v1_groups_groupId_users_userId
     *
     * @param groupId Group ID
     * @param userId  User ID
     * @return Status Code
     */
    String removeUser(double groupId, double userId);
}
