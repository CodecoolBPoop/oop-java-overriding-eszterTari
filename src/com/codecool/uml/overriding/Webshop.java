package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {
        Order order = new Order();
        CheckoutProcess checkoutProcess = new CheckoutProcess();
        PaymentProcess paymentProcess = new PaymentProcess();

        System.out.println("Test for steps in right sequence:");
        checkoutProcess.process(order);
        paymentProcess.process(order);
        System.out.println("Test is finished!");
        System.out.println("");


        System.out.println("Test for steps in wrong sequence:");
        paymentProcess.process(order);
        checkoutProcess.process(order);
        System.out.println("Test is finished!");
        System.out.println("");
    }
}
