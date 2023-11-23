package mine;

public class CreditCardpaymentGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("second second");
        System.out.println("Processing credit card payment: " + amount);
    }

}
