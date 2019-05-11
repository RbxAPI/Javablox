module io.github.rbxapi.javablox.api {
    requires okhttp3;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires java.sql;
    requires gson;

    exports rbxapi.javablox.model.common;
    exports rbxapi.javablox.model.accountsettings;
    exports rbxapi.javablox.model.assetdelivery;
    exports rbxapi.javablox.model.common.email;
    exports rbxapi.javablox.model.common.serial;
    exports rbxapi.javablox.model.common.asset;
    exports rbxapi.javablox.model.avatar;
    exports rbxapi.javablox.model.common.avatar;
    exports rbxapi.javablox.model.auth;
    exports rbxapi.javablox.model.common.user;
    exports rbxapi.javablox.model.common.badge;
    exports rbxapi.javablox.model.badge;
    exports rbxapi.javablox.model.common.universe;

    exports rbxapi.javablox.api.auth;
    exports rbxapi.javablox.api.accountsettings;
    exports rbxapi.javablox.api.assetdelivery;
    exports rbxapi.javablox.api.avatar;
    exports rbxapi.javablox.api.badges;
}