package org.example;

public class OnlinePayments implements PaymentsFactory {
    @Override
    public int getFee() {

        return 300;
    }
}
