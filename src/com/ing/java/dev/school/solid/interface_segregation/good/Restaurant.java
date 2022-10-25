package com.ing.java.dev.school.solid.interface_segregation.good;

public class Restaurant {}

interface OrderInterface{
    public void placeOrder();
}

interface PaymentInterface{
    public void payForOrder();
}
class OnlineCustomerImpl implements OrderInterface, PaymentInterface {

    @Override
    public void placeOrder() {
        // logic to place online order
    }
    @Override
    public void payForOrder() {
        // logic to do online payment
    }
}

class WalkInCustomerImpl implements OrderInterface, PaymentInterface {

    @Override
    public void placeOrder() {
        // logic to place in-person order
    }
    @Override
    public void payForOrder() {
        // logic to do in-person payment
    }
}

class TelephoneCustomerImpl implements OrderInterface, PaymentInterface {

    @Override
    public void placeOrder() {
        // logic to place telephonic order
    }
    @Override
    public void payForOrder() {
        // logic to do online payment
    }
}