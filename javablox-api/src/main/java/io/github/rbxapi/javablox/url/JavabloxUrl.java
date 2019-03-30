package io.github.rbxapi.javablox.url;

import java.text.MessageFormat;

class JavabloxUrl {
    private static final String protocol = "https://";

    static String genDomain(String ddns, int ver) {
        return MessageFormat.format("{0}{1}.roblox.com/v{2}/", protocol, ddns, ver);
    }
}
