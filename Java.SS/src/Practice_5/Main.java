package Practice_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Number must be positive!");
            sc.close();
            return;
        }
        Bank bank = new Bank(n);

        for (int i = 0; i < n; i++) {
            System.out.println("\nCustomer " + (i + 1));
            String accountNumber;
            while (true) {
                System.out.print("Enter 14-digit account number: ");
                accountNumber = sc.nextLine();

                if (accountNumber.matches("\\d{14}")) {
                    break;
                }

                System.out.println("Account number must contain 14 digits!");
            }
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter initial balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();

            while (balance < 0) {
                System.out.print("Balance cannot be negative. Enter again: ");
                balance = sc.nextDouble();
                sc.nextLine();
            }
            Customer customer = new Customer(
                    accountNumber, name, balance
            );

            bank.addCustomer(customer);
        }
        int choice;
        do {
            System.out.println("\n===== BANKING SYSTEM =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display account details");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter account number: ");
                String accountNumber = sc.nextLine();

                Customer customer = bank.findCustomer(accountNumber);

                if (customer == null) {
                    System.out.println("Account not found!");
                    continue;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Deposit amount: ");
                        customer.deposit(sc.nextDouble());
                        sc.nextLine();
                        break;

                    case 2:
                        System.out.print("Withdrawal amount: ");
                        customer.withdraw(sc.nextDouble());
                        sc.nextLine();
                        break;

                    case 3:
                        customer.displayDetails();
                        break;
                }
            } else if (choice != 4) {
                System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        System.out.println("Thank you for using our banking system!");
        sc.close();
    }
}
