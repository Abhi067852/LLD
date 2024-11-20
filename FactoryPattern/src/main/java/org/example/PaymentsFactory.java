package org.example;

public interface PaymentsFactory {
    public int getFee();
    public void sendAmount(int amount);
}
