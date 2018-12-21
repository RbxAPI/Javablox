package io.github.rbxapi.Javablox.api.friends.usercontacts;

public interface IUserContact {

    /**
     * https://friends.roblox.com/docs#!/UserContacts/post_v1_contacts_match
     * @param requestModel JSON
     * @return Contacts
     */
    String match(String requestModel);

    /**
     * https://friends.roblox.com/docs#!/UserContacts/post_v1_contacts_update
     * @param requestModel JSON
     * @return Status code
     */
    String update(String requestModel);
}
