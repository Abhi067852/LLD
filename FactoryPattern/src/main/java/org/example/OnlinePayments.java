package org.example;

public class OnlinePayments implements PaymentsFactory {
    @Override
    public int getFee() {

        return 300;
    }

    @Override
    public void sendAmount(int amount) {
        System.out.println(amount+"has been sent");
    }
}
