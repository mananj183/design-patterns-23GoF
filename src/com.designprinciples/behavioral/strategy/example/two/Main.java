package behavioral.strategy.example.two;

import behavioral.strategy.example.two.service.PaymentService;
import behavioral.strategy.example.two.service.impl.CreditCardPaymentStrategy;

//client
public class Main {
    static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CreditCardPaymentStrategy());
        paymentService.processOrder();
    }
}
