package io.github.rbxapi.javablox.endpoint.accountsetting;

import io.github.rbxapi.javablox.Client;
import io.github.rbxapi.javablox.api.accountsettings.Account;
import io.github.rbxapi.javablox.api.accountsettings.accountinfosettings.ContactUpsell;
import io.github.rbxapi.javablox.api.accountsettings.email.Email;
import io.github.rbxapi.javablox.endpoint.BaseEndpoint;
import io.github.rbxapi.javablox.url.AccountSettingUrl;

import java.util.concurrent.CompletableFuture;

public class UserAccountInfoEndpoint implements ContactUpsell, Account, Email {

    @Override
    public CompletableFuture<String> getUpsell() {
        return Client.get(AccountSettingUrl.GET_CONTACT_UPSELL);
    }

    @Override
    public CompletableFuture<String> suppressUpsell(boolean suppress) {
        return Client.post(AccountSettingUrl.POST_SUPPRESS_UPSELL + suppress);
    }

    @Override
    public CompletableFuture<String> getSettingsGroups() {
        return Client.get(AccountSettingUrl.GET_SETTINGS_GROUPS);
    }

    @Override
    public CompletableFuture<String> getEmail() {
        return Client.get(AccountSettingUrl.EMAIL);
    }

    //TODO: Implement
    @Override
    public CompletableFuture<String> setEmail(String requestBody) {
        return Client.post(AccountSettingUrl.EMAIL, requestBody);
    }

    //TODO: Implement
    @Override
    public CompletableFuture<String> sendVerifyEmail(String request) {
        return Client.post(AccountSettingUrl.EMAIL_VERIFY, request);
    }
}
