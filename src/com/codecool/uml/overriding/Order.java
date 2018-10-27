package com.codecool.uml.overriding;

public class Order implements Orderable {

    private int id = 0;
    private String status;

    public Order() {
        id++;
        status = "new";
    }

    public String  getStatus() {
        return status;
    }

    public boolean checkout() {
        if (getStatus().equals("new")) {
            status = "checked";
            return true;
        } else {
            return false;
        }
    }

    public boolean pay() {
        if (getStatus().equals("checked")){
            status = "payed";
            return true;
        } else {
            return false;
        }
    }
}
