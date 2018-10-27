package com.codecool.uml.overriding;

public class CheckoutProcess extends AbstractProcess {

    protected void action(Orderable item) {
        if (item.checkout()){
            System.out.println("Succesful checkout!");
        } else {
            System.out.println("Checkout failed!");
        }

    }
}
