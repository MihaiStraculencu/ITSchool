package isp;

/**
 * Refactor the PaymentProcessor interface to adhere to ISP.
 */

public class Main {
    public static void main(String[] args) {
        // Create instances of the payment processors
        PaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        PaymentProcessor payPalProcessor = new PayPalPaymentProcessor();

        // Use the payment processors
        creditCardProcessor.processPayment();
        payPalProcessor.processPayment();
    }
}
