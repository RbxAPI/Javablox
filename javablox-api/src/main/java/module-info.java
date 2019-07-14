/**
 * Retrofit call declaration
 */
open module rbxapi.javablox.api {
    requires retrofit2.converter.gson;
    requires retrofit2;
    requires java.sql;
    requires okhttp3;

    exports rbxapi.javablox.api;
    exports rbxapi.javablox.api.user.account;
    exports rbxapi.javablox.api.user.account.info;
    exports rbxapi.javablox.client;
    exports rbxapi.javablox.svc;
}