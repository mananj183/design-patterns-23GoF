package behavioral.strategy.example.two.service.impl;

import behavioral.strategy.example.two.service.PaymentStrategy;

import java.time.ZonedDateTime;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    private CreditCard creditCard;

    @Override
    public void collectPaymentDetails() {
        creditCard = new CreditCard(123445, ZonedDateTime.now(), 123);
    }

    @Override
    public boolean validatePayeeDetails() {
        return creditCard.expiryDate().isAfter(ZonedDateTime.now());
    }

    @Override
    public void pay(int amound) {
        System.out.println("paying using credit card");
    }

    private static record CreditCard(Integer cardNumber, ZonedDateTime expiryDate, Integer cvv){}
}
