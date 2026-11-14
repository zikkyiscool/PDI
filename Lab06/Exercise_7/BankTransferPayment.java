package Exercise_7;

class BankTransferPayment extends Payment {

    @Override
    void process_payment(double amount) {
        System.out.println("Processing bank transfer payment: $" + amount);
    }
}
