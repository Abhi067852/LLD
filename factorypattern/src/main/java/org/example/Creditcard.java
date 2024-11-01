package org.example;

public class Creditcard implements Payment{
    int amt;
    @Override
    public void Amount(int amt) {
        this.amt = amt;
        System.out.println(amt + " payed via Credit Card!");
    }





}
