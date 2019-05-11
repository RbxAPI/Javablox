package rbxapi.javablox.model.common.avatar;

import rbxapi.javablox.model.common.asset.Asset;
import rbxapi.javablox.model.common.serial.IdNamePair;

public class Outfit extends IdNamePair {
    private Asset[] assets;
    private BodyColor bodyColors;
    private Scale scale;
    private AvatarType playerAvatarType;
    private boolean isEditable;
}
