package io.github.rbxapi.javablox.endpoint.accountsetting;

import io.github.rbxapi.javablox.api.accountsetting.privacysettings.Privacy;
import java.util.concurrent.CompletableFuture;

public class Privacy implements io.github.rbxapi.javablox.api.accountsetting.privacysettings.Privacy{

    @Override
    CompletableFuture<String> getPrivacySetting() {
        return null
    }

}