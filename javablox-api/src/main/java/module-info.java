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
    exports rbxapi.javablox.api.user.account;
    exports rbxapi.javablox.api.user.account.info;
    exports rbxapi.javablox.svc;
    exports rbxapi.javablox.model;
    exports rbxapi.javablox.exception;
    exports rbxapi.javablox.client;
}