package com.fgtpw.bobaapplication.login;

import data.User;

public class LoginManager {

    private static LoginManager instance;
    private User currentUser = new User("Michelle", "911", "michelle_wong47@hotmail.com");

    private LoginManager() {

    }

    public static LoginManager getInstance() {
        if (instance == null) {
            instance = new LoginManager();
        }
        return instance;
    }

    public User currentUser() {
        return currentUser;
    }
}
