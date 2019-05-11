package rbxapi.javablox.model.common.badge;

import rbxapi.javablox.model.common.serial.IdNamePair;
import rbxapi.javablox.model.common.universe.Universe;

public class Badge extends IdNamePair {
    private String description;
    private boolean enabled;
    private int iconImageId;
    private String created;
    private String updated;
    private Statistic statistics;
    private Universe awardingUniverse;
}