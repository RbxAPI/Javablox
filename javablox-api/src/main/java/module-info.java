module io.github.rbxapi.javablox.api {
    requires okhttp3;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires java.sql;

    opens rbxapi.javablox.response.accountsettings;
}