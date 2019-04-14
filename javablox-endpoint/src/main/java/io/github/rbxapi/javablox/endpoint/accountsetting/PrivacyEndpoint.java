package io.github.rbxapi.javablox.endpoint.accountsetting;

import io.github.rbxapi.javablox.Client;
import io.github.rbxapi.javablox.api.accountsettings.privacysettings.Privacy;
import io.github.rbxapi.javablox.url.AccountSettingUrl;

import java.util.concurrent.CompletableFuture;

public class PrivacyEndpoint implements Privacy{

    @Override
    public CompletableFuture<String> getPrivacySetting() {
        return Client.get(AccountSettingUrl.PRIVACY);
    }

    @Override
    public CompletableFuture<String> patchPrivacySetting(String model) {
        return Client.patch(AccountSettingUrl.PRIVACY, model);
    }

    @Override
    public CompletableFuture<String> getPrivacyInfo() {
        return Client.get(AccountSettingUrl.PRIVACY_INFO);
    }

}