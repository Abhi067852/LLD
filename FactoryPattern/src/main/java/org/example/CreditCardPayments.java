package org.example;

public class CreditCardPayments implements PaymentsFactory {
    @Override
    public int getFee() {
        return 1000;
    }

    @Override
    public void sendAmount(int amount) {
        System.out.println(amount+"amount has been sent");
    }
}
