package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        System.out.println("Hello Sir!");
        System.out.println("Please select your payment method");
        System.out.println("1.Credit Card   ||   2.Online ");
        Scanner sc  =new Scanner(System.in);
        System.out.println("Select any option : ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                payment.getTransactionFee("CreditCard");
                break;
            case 2:
                payment.getTransactionFee("Online");
                break;
            default:
                System.out.println("Select correct option");
        }
    }
}