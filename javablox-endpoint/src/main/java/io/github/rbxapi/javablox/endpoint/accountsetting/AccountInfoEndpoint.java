package io.github.rbxapi.javablox.endpoint.accountsetting;

import io.github.rbxapi.javablox.Client;
import io.github.rbxapi.javablox.api.accountsettings.accountinfosettings.ContactUpsell;
import io.github.rbxapi.javablox.url.AccountSettingUrl;

import java.util.concurrent.CompletableFuture;

public class AccountInfoEndpoint implements ContactUpsell {

    @Override
    public CompletableFuture<String> getUpsell() {
        return Client.get(AccountSettingUrl.GET_CONTACT_UPSELL);
    }

    @Override
    public CompletableFuture<String> suppressUpsell(boolean suppress) {
        return Client.post(AccountSettingUrl.POST_SUPPRESS_UPSELL + suppress);
    }
}
