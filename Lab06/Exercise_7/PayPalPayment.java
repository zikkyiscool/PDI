package Exercise_7;

class PayPalPayment extends Payment {

    @Override
    void process_payment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }
}
