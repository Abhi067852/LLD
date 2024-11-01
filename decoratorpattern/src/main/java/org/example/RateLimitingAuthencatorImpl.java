package org.example;

public class RateLimitingAuthencatorImpl implements Authencator {
    int attempts = 0;
    private final Authencator authencator;

    public RateLimitingAuthencatorImpl(Authencator authencator) {
        this.authencator = authencator;
    }

    @Override
    public boolean authenticate(String userName, String password) {
        if(attempts>=2)
        {
            System.out.println("Too many attempts");
            return false;
        }
        attempts++;
        boolean authenticated = authencator.authenticate(userName,password);
        if(authenticated) {
            attempts = 0;
            System.out.println("authennticated");
        } else
            System.out.println("Wrong password");

        return authenticated;
    }
}
