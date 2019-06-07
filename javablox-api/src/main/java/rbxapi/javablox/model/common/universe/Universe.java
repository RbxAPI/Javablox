package rbxapi.javablox.model.common.universe;

import rbxapi.javablox.model.common.avatar.Scale;

public class Universe {
    private int id;
    private String name;
    private String description;
    private UniverseAvatarType universeAvatarType;
    private UniverseAnimationType universeAnimationType;
    private UniverseCollisionType universeCollisionType;
    private UniverseJointPositioningType universeJointPositioningType;
    private boolean isArchived;
    private boolean isFriendsOnly;
    private Genre genre;
    private String[] playableDevices;
    private boolean isForSale;
    private int price;
    private UniverseAvatarAsset[] universeAvatarAssetOverrides;
    private Scale universeAvatarMinScales;
    private Scale universeAvatarMaxScales;
    private boolean studioAccessToApisAllowed;
}
