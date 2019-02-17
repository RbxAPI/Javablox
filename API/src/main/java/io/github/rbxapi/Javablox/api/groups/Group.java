package io.github.rbxapi.javablox.api.groups;

public interface Group {
    /**
     * https://groups.roblox.com/docs#!/Groups/get_v2_groups
     * @param groupIds Array
     * @return Groups
     */
    String getGroups(double[] groupIds);
}
