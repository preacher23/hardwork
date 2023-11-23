package mine;

public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processPayment(double amount) {
        System.out.println("fisrt first");
        // Delegate the payment processing to the provided PaymentGateway
        paymentGateway.processPayment(amount);
    }
}
