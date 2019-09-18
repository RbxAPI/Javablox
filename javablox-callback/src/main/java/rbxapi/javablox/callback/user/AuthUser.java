package rbxapi.javablox.callback.user;

import rbxapi.javablox.callback.user.account.AccountInfo;
import rbxapi.javablox.client.JavabloxClient;

public class AuthUser extends User implements rbxapi.javablox.api.user.AuthUser{
    private AccountInfo accountInfo;

    public AuthUser(String cookie) {
        JavabloxClient client = new JavabloxClient(cookie);
        accountInfo = new AccountInfo(client.accountInfo());
    }

    public AccountInfo getAccountInfo() {
        return accountInfo;
    }
}
