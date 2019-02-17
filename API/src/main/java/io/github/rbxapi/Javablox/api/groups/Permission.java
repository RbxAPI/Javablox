package io.github.rbxapi.javablox.api.groups;

public interface Permission {
    /**
     * https://groups.roblox.com/docs#!/Permissions/get_v1_groups_groupId_roles_roleSetId_permissions
     * @param groupId Group ID
     * @param roleSetId Role ID
     * @return Permissions
     */
    String getRolePermissions(double groupId, int roleSetId);

    /**
     * <p>Guest is a role</p>
     * https://groups.roblox.com/docs#!/Permissions/get_v1_groups_groupId_roles_guest_permissions
     * @param groupId Group ID
     * @return Permissions
     */
    String getGuestPermissions(double groupId);
}
