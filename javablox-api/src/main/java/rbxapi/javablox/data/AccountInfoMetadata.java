package rbxapi.javablox.data;

public class AccountInfoMetadata {
    private boolean descriptionEnabled;
    private boolean birthdayEnabled;
    private boolean genderEnabled;
    private boolean promotionChannelEnabled;
    private boolean allowedNotificationsEndpointDisabled;
    private boolean accountSettingsPolicyEnabled;
    private boolean phoneNumberEnabled;

    public AccountInfoMetadata(boolean d, boolean b, boolean g, boolean pr, boolean al, boolean ac, boolean ph) {
        this.descriptionEnabled = d;
        this.birthdayEnabled = b;
        this.genderEnabled = g;
        this.promotionChannelEnabled = pr;
        this.allowedNotificationsEndpointDisabled = al;
        this.accountSettingsPolicyEnabled = ac;
        this.phoneNumberEnabled = ph;
    }

    public boolean isDescriptionEnabled() {return descriptionEnabled;}
    public boolean isBirthdayEnabled() {return birthdayEnabled;}
    public boolean isGenderEnabled() {return genderEnabled;}
    public boolean isPromotionChannelEnabled() {return promotionChannelEnabled;}
    public boolean isAllowedNotificationsEndpointDisabled() {return allowedNotificationsEndpointDisabled;}
    public boolean isAccountSettingsPolicyEnabled() {return accountSettingsPolicyEnabled;}
    public boolean isPhoneNumberEnabled() {return phoneNumberEnabled;}
}
