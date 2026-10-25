package behavioral.strategy.example.two.service;

//Context
public class PaymentService {
    private final PaymentStrategy paymentStrategy;
    private int cost;
    private boolean includeDeliveryCost;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder(){
        paymentStrategy.collectPaymentDetails();
        if (paymentStrategy.validatePayeeDetails()){
            paymentStrategy.pay(getTotal());
        }
    }

    private int getTotal(){
        return includeDeliveryCost ? cost + 20 : cost;
    }
}
