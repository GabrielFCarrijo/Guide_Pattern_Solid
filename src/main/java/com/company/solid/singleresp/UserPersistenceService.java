package com.company.solid.singleresp;

public class UserPersistenceService {

    private Store store = new Store();

    public void persistenceUser(User user) {
        store.store(user);
    }
}
