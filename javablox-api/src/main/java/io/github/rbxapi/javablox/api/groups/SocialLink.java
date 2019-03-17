package io.github.rbxapi.javablox.api.groups;

public interface SocialLink {
    /**
     * https://groups.roblox.com/docs#!/SocialLinks/get_v1_groups_groupId_social_links
     *
     * @param groupId Group ID
     * @return Links
     */
    String getLinks(double groupId);

    /**
     * https://groups.roblox.com/docs#!/SocialLinks/post_v1_groups_groupId_social_links
     *
     * @param groupId Group ID
     * @param request Link
     * @return Links
     */
    String postLink(double groupId, String request);

    /**
     * https://groups.roblox.com/docs#!/SocialLinks/delete_v1_groups_groupId_social_links_socialLinkId
     *
     * @param groupId      Group ID
     * @param socialLinkId Social Link ID
     * @return Status Code
     */
    String removeLink(double groupId, double socialLinkId);

    /**
     * https://groups.roblox.com/docs#!/SocialLinks/patch_v1_groups_groupId_social_links_socialLinkId
     *
     * @param groupId      Group ID
     * @param socialLinkId Social Link ID
     * @param request      Updated link info
     * @return Status Code
     */
    String updateLink(double groupId, double socialLinkId, String request);
}
