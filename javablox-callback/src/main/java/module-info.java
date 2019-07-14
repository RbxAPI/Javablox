module rbxapi.javablox.callback {
    requires retrofit2;
    requires static transitive rbxapi.javablox.api;

    provides rbxapi.javablox.api.user.account.AccountInfo with rbxapi.javablox.callback.user.account.AccountInfo;
}