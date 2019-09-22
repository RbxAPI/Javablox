/**
 * Retrofit call declaration
 */
open module rbxapi.javablox.api {
    requires retrofit2.converter.gson;
    requires retrofit2;
    requires java.sql;
    requires okhttp3;
    requires gson;

    exports rbxapi.javablox.api;
    exports rbxapi.javablox.api.user;
    exports rbxapi.javablox.api.user.account;
    exports rbxapi.javablox.svc;
    exports rbxapi.javablox.data;
    exports rbxapi.javablox.client;
}