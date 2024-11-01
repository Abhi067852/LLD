package org.example;

public class Paypal implements Payment{

    @Override
    public void Amount(int amt) {
        System.out.println(amt + " paid via paypal!");
    }
}
