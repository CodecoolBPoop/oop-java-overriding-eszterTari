package com.codecool.uml.overriding;

public abstract class AbstractProcess {

    public void process(Orderable item) {
        stepBefore();
        action(item);
        stepAfter();
    }

    public void stepBefore() {
        System.out.println("Please wait...");
    }

    protected void action(Orderable item) {

    }

    public void stepAfter() {
        System.out.println("Action is done.");
    }
}
//
//    Succesful checkout!
//        Successful ordering!
//        Successful payment!
//        Successful ordering!
//        Payment failed Please try again!
//        Successful ordering!
//        Checkout failed!
//        Successful ordering!

//    Succesful checkout!
//        Your order was successfully paid and placed!
//        Successful payment!
//        Your order was successfully paid and placed!
//        Payment failed Please try again!
//        Your order was successfully paid and placed!
//        Checkout failed!
//        Your order was successfully paid and placed!