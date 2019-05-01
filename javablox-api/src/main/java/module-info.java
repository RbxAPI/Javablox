module io.github.rbxapi.javablox.api {
    requires okhttp3;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires java.sql;

    opens rbxapi.javablox.response.accountsettings;
    opens rbxapi.javablox.response.common.email;
    opens rbxapi.javablox.response.common.theme;
    opens rbxapi.javablox.response.common.bool;

    exports rbxapi.javablox.api.accountsettings;
}