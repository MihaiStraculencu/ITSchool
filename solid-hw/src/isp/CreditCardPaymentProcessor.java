package isp;
public class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("credit card pay");
    }
}
