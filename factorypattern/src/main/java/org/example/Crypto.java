package org.example;

public class Crypto implements Payment {


    @Override
    public void Amount(int amt) {
        System.out.println(amt + " payed via crypto!");
    }
}
