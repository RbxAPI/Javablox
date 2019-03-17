package io.github.rbxapi.javablox.api.economy;

public interface Currency {

    /**
     * https://economy.roblox.com/docs#!/Currency/get_v1_groups_groupId_currency
     *
     * @param groupId Group ID
     * @return Robux amount
     */
    String getGroupCurrency(double groupId);

    /**
     * https://economy.roblox.com/docs#!/Currency/get_v1_users_userId_currency
     *
     * @param userId User ID
     * @return Robux Amount
     */
    String getUserCurrency(double userId);
}
