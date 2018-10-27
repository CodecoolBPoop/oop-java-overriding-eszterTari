package com.codecool.uml.overriding;

public class PaymentProcess extends AbstractProcess {

    protected void action(Orderable item) {
        if (item.pay()) {
            System.out.println("Successful payment!");
        } else {
            System.out.println("Payment failed Please try again!");
        }
    }

}
