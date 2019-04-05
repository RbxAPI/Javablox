package io.github.rbxapi.javablox.endpoint;

import io.github.rbxapi.javablox.endpoint.accountsetting.AccountSettingEndpoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void ContactUpsellTest() {
        assertEquals(TestStrings.unauth, AccountSettingEndpoint.userAccountInfo.getUpsell().join());
    }

    @Test
    public void suppressUpsellTest() {
        assertEquals(TestStrings.unauth, AccountSettingEndpoint.userAccountInfo.suppressUpsell(true).join());
    }
}
