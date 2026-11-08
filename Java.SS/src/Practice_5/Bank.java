package Practice_5;

public class Bank {
    private Customer[] customers;
    private int count;

    public Bank(int size) {
        customers = new Customer[size];
        count = 0;
    }

    public void addCustomer(Customer customer) {
        if (count < customers.length) {
            customers[count] = customer;
            count++;
        } else {
            System.out.println("Customer list is full!");
        }
    }

    public Customer findCustomer(String accountNumber) {
        for (int i = 0; i < count; i++) {
            if (customers[i].getAccountNumber().equals(accountNumber)) {
                return customers[i];
            }
        }
        return null;
    }
}

