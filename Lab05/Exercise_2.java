import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num_1;
        int num_2;
        float result = 0;

        System.out.println("Please input number from 1 to 6");
        System.out.println("1.Addition (+)");
        System.out.println("2.Subtraction (-)");
        System.out.println("3.Multiplication (x)");
        System.out.println("4.Division (/)");
        System.out.println("5.Find sum of x number");
        System.out.println("6.Exit");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Please input first number: ");
                num_1 = sc.nextInt();
                System.out.print("Please input second number: ");
                num_2 = sc.nextInt();
                result = num_1 + num_2 ;
                System.out.println("The result is " + result);
                System.out.println("Thank you for using our program!");
                break;

            case 2:
                System.out.print("Please input first number: ");
                num_1 = sc.nextInt();
                System.out.print("Please input second number: ");
                num_2 = sc.nextInt();
                result = num_1 - num_2 ;
                System.out.println("The result is " + result);
                System.out.println("Thank you for using our program!");
                break;

            case 3:
                System.out.print("Please input first number: ");
                num_1 = sc.nextInt();
                System.out.print("Please input second number: ");
                num_2 = sc.nextInt();
                result = num_1 * num_2 ;
                System.out.println("The result is " + result);
                System.out.println("Thank you for using our program!");
                break;

            case 4:
                System.out.print("Please input first number: ");
                num_1 = sc.nextInt();
                System.out.print("Please input second number: ");
                num_2 = sc.nextInt();
                if (num_2 != 0) {
                        result = (float) num_1 / num_2;
                        System.out.println("The result is " + result);
                        System.out.println("Thank you for using our program!");
                    } else {
                        System.out.println("You cannot divide by zero you big donut!");
                    }
                break;

            case 5:
                System.out.print("Please input number: ");
                num_1 = sc.nextInt();
                for(int i = 1 ; i<=num_1 ;i++){
                    result += i; 
                }
                System.out.println("The result is " + result);
                break;

            case 6:
                System.out.println("Thank you for using our program!");
                break;

            default:
                System.out.println("Please input from 1 to 6");
                break;
        }
        sc.close();
   } 
}
