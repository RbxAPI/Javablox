package io.github.rbxapi.javablox.api.clientsettings;

public interface VersionCheck {

    /**
     * https://clientsettings.roblox.com/docs#!/VersionCheck/get_v1_client_version_binaryType
     * @param binaryType Binary Type
     * @return Version info
     */
    String getClientVersion(String binaryType);
}
