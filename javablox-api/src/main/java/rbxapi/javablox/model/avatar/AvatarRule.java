package rbxapi.javablox.model.avatar;

import rbxapi.javablox.model.common.avatar.AvatarType;

public class AvatarRule {
    private AvatarType[] playerAvatarTypes;
    private AssetTypeRulesModel[] wearableAssetTypes;
    private BodyColorModel[] bodyColorsPalette;
    private BodyColorModel[] basicBodyColorsPalette;
    private int minimumDeltaEBodyColorDifference;
    private boolean proportionsAndBodyTypeEnabledForUser;
    private DefaultClothingAssets defaultClothingAssetLists;
    private boolean bundlesEnabledForUser;
    private boolean emotesEnabledForUser;
}
