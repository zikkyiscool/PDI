package Exercise_7;

public class Main {

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();
        Payment p3 = new BankTransferPayment();

        p1.process_payment(100.00);
        p2.process_payment(250.00);
        p3.process_payment(500.00);

    }
}

