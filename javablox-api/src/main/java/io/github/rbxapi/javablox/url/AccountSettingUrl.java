package io.github.rbxapi.javablox.url;

public class AccountSettingUrl {
    private static final String dns1 = JavabloxUrl.genDomain("accountsettings", 1);

    public static final String GET_CONTACT_UPSELL = dns1 + "user/screens/contact-upsell";
    public static final String POST_SUPPRESS_UPSELL = GET_CONTACT_UPSELL + "/suppress?suppress=";

    public static final String GET_SETTINGS_GROUPS = "account/settings/settings-groups";

    public static final String GET_EMAIL = "email";
    //TODO: Add 2 more email URL
}
