package behavioral.strategy.example.two.service;

public interface PaymentStrategy {
    void collectPaymentDetails();
    boolean validatePayeeDetails();
    void pay(int amound);
}
