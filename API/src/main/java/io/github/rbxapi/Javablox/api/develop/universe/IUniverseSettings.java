package io.github.rbxapi.Javablox.api.develop.universe;

public interface IUniverseSettings {

    /**
     * Gets config of the universe
     * @param universeId Universe Id
     * @return Universe Info
     */
    String getConfig(String universeId);

    /**
     * Updates config of the universe
     * @param universeId Universe Id
     * @param model The patched version of the Universe Settings
     * @return Response code
     */
    String patchConfig(String universeId, String model);
}
