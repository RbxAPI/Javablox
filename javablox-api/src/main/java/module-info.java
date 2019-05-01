module io.github.rbxapi.javablox.api {
    requires okhttp3;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires java.sql;
    requires gson;

    exports rbxapi.javablox.model.accountsettings;
    exports rbxapi.javablox.model.assetdelivery;
    exports rbxapi.javablox.model.common.email;
    exports rbxapi.javablox.model.common.bool;
    exports rbxapi.javablox.model.common.asset;
    exports rbxapi.javablox.api.accountsettings;
    exports rbxapi.javablox.api.assetdelivery;
}