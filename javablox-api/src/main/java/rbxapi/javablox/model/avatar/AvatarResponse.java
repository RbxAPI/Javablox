package rbxapi.javablox.model.avatar;

import rbxapi.javablox.model.common.asset.Asset;
import rbxapi.javablox.model.common.avatar.AvatarType;
import rbxapi.javablox.model.common.avatar.BodyColor;
import rbxapi.javablox.model.common.avatar.Scale;

public class AvatarResponse {
    private Scale scales;
    private AvatarType playerAvatarType;
    private BodyColor bodyColors;
    private Asset[] assets;
    private boolean defaultShirtApplied;
    private boolean defaultPantsApplied;
}
