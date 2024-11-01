package org.example;

public class Payment {

    PaymentsFactory creditCardPayments = new CreditCardPayments();
    PaymentsFactory onlinePayments = new OnlinePayments();
    public void getTransactionFee(String method) {
        switch (method) {
            case "CreditCard" :
                System.out.println(creditCardPayments.getFee());
                break;
            case "Online" :
                System.out.println(onlinePayments.getFee());
                break;
            default:
                System.out.println("Please Select Correct Payment Method");
        }
    }
}
