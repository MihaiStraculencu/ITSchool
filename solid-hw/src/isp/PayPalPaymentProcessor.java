package isp;

public class PayPalPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("paypal card pay");
    }
}
