package mine;

public class PaypalPaymentGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: " + amount);
    }
}
