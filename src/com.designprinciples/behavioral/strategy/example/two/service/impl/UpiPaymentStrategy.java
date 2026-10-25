package behavioral.strategy.example.two.service.impl;

import behavioral.strategy.example.two.service.PaymentStrategy;

public class UpiPaymentStrategy implements PaymentStrategy {
    private String upiId;

    // Pop up to collect UPI ID details
    @Override
    public void collectPaymentDetails() {
        upiId = "form-data@upi.id";
    }

    @Override
    public boolean validatePayeeDetails() {
        return true;
    }

    @Override
    public void pay(int amound) {
        System.out.println("Doing payment using UPI");
    }
}
