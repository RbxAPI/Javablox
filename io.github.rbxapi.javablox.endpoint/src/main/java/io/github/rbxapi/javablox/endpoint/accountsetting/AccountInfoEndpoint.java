package io.github.rbxapi.javablox.endpoint.accountsetting;

import io.github.rbxapi.javablox.Client;
import io.github.rbxapi.javablox.api.accountsettings.accountinfosettings.ContactUpsell;

import java.util.concurrent.CompletableFuture;

public class AccountInfoEndpoint implements ContactUpsell {

    @Override
    public String getUpsell() {
        CompletableFuture<String> future = Client.get("https://accountsettings.roblox.com/v1/user/screens/contact-upsell");
        return future.join();
    }

    @Override
    public String suppressUpsell(boolean suppress) {
        return null;
    }
}
