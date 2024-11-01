package org.example;

public class PaymentFactory {

    public void PaymentMethod(String method, int amt){

        switch (method){
            case "credit card":
                new Creditcard().Amount(amt);
                break;
            case "crypto":
                new Crypto().Amount(amt);
                break;

            case "paypal":
                 new Paypal().Amount(amt);
                 break;
            default:
                System.out.println("Select valid method");


        }
    }

}
