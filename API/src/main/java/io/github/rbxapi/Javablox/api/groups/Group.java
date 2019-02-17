package io.github.rbxapi.javablox.api.groups;

import java.io.File;

public interface Group {
    /**
     * https://groups.roblox.com/docs#!/Groups/get_v2_groups
     * @param groupIds Array
     * @return Groups
     */
    String getGroups(double[] groupIds);

    /**
     * https://groups.roblox.com/docs#!/Groups/get_v1_groups_groupId
     * @param groupId Group ID
     * @return Group Info
     */
    String getGroupInfo(int groupId);

    /**
     * https://groups.roblox.com/docs#!/Groups/get_v1_groups_groupId_payouts
     * @param groupId Group ID
     * @return Percentages
     */
    String getPayouts(double groupId);

    /**
     * https://groups.roblox.com/docs#!/Groups/get_v1_groups_groupId_relationships_groupRelationshipType
     * @param groupId Group ID
     * @param groupRelationshipType Type
     * @param startRowIndex Index
     * @param maxRows limit
     * @return Relationships
     */
    String getRelationships(double groupId, String groupRelationshipType, int startRowIndex, int maxRows);

    /**
     * https://groups.roblox.com/docs#!/Groups/get_v1_groups_groupId_relationships_groupRelationshipType_requests
     * @param groupId Group ID
     * @param groupRelationshipType Type
     * @param startRowIndex Index
     * @param maxRows limit
     * @return Relationships
     */
    String getRelationshipRequests(double groupId, String groupRelationshipType, int startRowIndex, int maxRows);

    /**
     * https://groups.roblox.com/docs#!/Groups/get_v1_groups_metadata
     * @return Metadata
     */
    String getMetadata();

    /**
     * https://groups.roblox.com/docs#!/Groups/post_v1_groups_create
     * @apiNote This endpoint will charge Robux for the group purchase.
     * @param name Group name
     * @param description Group description
     * @param publicGroup Is the group public
     * @param buildersClubMembersOnly Only allow Builder's Club Members
     * @param files A file to upload (icon)
     * @return Group Info
     */
    String create(String name, String description, boolean publicGroup, boolean buildersClubMembersOnly, File files);

    /**
     * https://groups.roblox.com/docs#!/Groups/patch_v1_groups_groupId_status
     * @param groupId Group ID
     * @param statusRequest Status Request Message
     * @return Group Status
     */
    String setStatus(double groupId, String statusRequest);
}
