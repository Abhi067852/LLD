package org.example;

public class AuthencatorImpl implements Authencator {
    String userName = "TiwaAcq";
    String password = "Laptop2912@";
    @Override
    public boolean authenticate(String userName, String password) {
        if(userName.equals(this.userName)&& password.equals(this.password))
            return true;
        return false;
    }
}
