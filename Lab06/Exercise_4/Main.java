package Exercise_4;

public class Main {
    public static void main (String[]arge){
        SavingsAccount a1 = new SavingsAccount(
            "123456789", 1900,5);

        System.out.println("Account number: " + a1.account_number);
        System.out.println("Balance: " + a1.balance);
        System.out.println("Interest: " + a1.interest_rate);
    }
    
}
