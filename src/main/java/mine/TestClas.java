package mine;

public class TestClas {
    public static void main(String[] args) {
        System.out.println("first");
        PaymentGateway creditCardGateway = new CreditCardpaymentGateway();
        System.out.println("second");
        PaymentProcessor creditCardProcessor = new PaymentProcessor(creditCardGateway);
        System.out.println("third");
        creditCardProcessor.processPayment(50.0);
    }
}
