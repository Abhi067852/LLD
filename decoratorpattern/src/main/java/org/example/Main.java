package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Authencator authencator = new AuthencatorImpl();
        Authencator rateLimitingAuthencator = new RateLimitingAuthencatorImpl(authencator);
        rateLimitingAuthencator.authenticate("TiwaAcq","Laptop23");
        rateLimitingAuthencator.authenticate("TiwaAcq","Laptop2912@");
        rateLimitingAuthencator.authenticate("TiwaAcq","Laptop2333");

    }
}