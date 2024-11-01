package org.example;

public class AuthencatorOTPImpl implements Authencator {

    private final Authencator authencator;

    public AuthencatorOTPImpl(Authencator authencator) {
        this.authencator = authencator;
    }

    @Override
    public boolean authenticate(String userName, String password) {
        boolean authenticated = authencator.authenticate(userName,password);
        if(authenticated)
        {
            return verifyOTP();
        }
        return false;
    }

    private boolean verifyOTP() {
        return true;
    }

}
