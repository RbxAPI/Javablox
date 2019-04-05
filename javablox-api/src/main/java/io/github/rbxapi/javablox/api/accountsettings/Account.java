package io.github.rbxapi.javablox.api.accountsettings;

import java.util.concurrent.CompletableFuture;

public interface Account {
    /**
     * https://accountsettings.roblox.com/docs#!/Accounts/get_v1_account_settings_settings_groups
     * @return Setting Groups
     */
    CompletableFuture<String> getSettingsGroups();
}
