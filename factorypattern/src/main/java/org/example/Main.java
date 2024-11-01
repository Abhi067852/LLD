package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        PaymentFactory paymentFactory = new PaymentFactory();
        paymentFactory.PaymentMethod("paypal",200);
        paymentFactory.PaymentMethod("cash",300);
    }
}