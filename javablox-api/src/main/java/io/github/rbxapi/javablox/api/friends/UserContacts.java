package io.github.rbxapi.javablox.api.friends;

public interface UserContacts {

    /**
     * https://friends.roblox.com/docs#!/UserContacts/post_v1_contacts_match
     *
     * @param requestModel JSON
     * @return Contacts
     */
    String match(String requestModel);

    /**
     * https://friends.roblox.com/docs#!/UserContacts/post_v1_contacts_update
     *
     * @param requestModel JSON
     * @return Status code
     */
    String update(String requestModel);
}
