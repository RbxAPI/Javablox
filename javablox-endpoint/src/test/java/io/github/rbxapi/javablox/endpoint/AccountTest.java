package io.github.rbxapi.javablox.endpoint;

import io.github.rbxapi.javablox.endpoint.accountsetting.AccountSettingEndpoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//TODO: Login test
public class AccountTest {
    private static final String setGroupStr = "[\n  {\n    \"Title\": \"Account Info\",\n    \"Url\": \"https://www.roblox.com/my/account#!/info\",\n    \"Suffix\": \"info\"\n  },\n  {\n    \"Title\": \"Security\",\n    \"Url\": \"https://www.roblox.com/my/account#!/security\",\n    \"Suffix\": \"security\"\n  },\n  {\n    \"Title\": \"Privacy\",\n    \"Url\": \"https://www.roblox.com/my/account#!/privacy\",\n    \"Suffix\": \"privacy\"\n  },\n  {\n    \"Title\": \"Notifications\",\n    \"Url\": \"https://www.roblox.com/my/account#!/notifications\",\n    \"Suffix\": \"notifications\"\n  }\n]";

    @Test
    public void ContactUpsellTest() {
        assertEquals(TestStrings.unauth, AccountSettingEndpoint.userAccountInfo.getUpsell().join());
    }

    @Test
    public void suppressUpsellTest() {
        assertEquals(TestStrings.unauth, AccountSettingEndpoint.userAccountInfo.suppressUpsell(true).join());
    }

    @Test
    public void settingsGroups() {
        assertEquals(TestStrings.unauth, AccountSettingEndpoint.userAccountInfo.getSettingsGroups().join());
    }
}
