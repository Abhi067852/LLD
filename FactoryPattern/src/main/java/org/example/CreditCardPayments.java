package org.example;

public class CreditCardPayments implements PaymentsFactory {
    @Override
    public int getFee() {
        return 1000;
    }
}
