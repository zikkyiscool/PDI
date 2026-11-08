import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args){
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);
        int n;
        int u;
        n = ra.nextInt(1,101);
        System.out.println("Enter a number from 1-100");
        u = sc.nextInt();
        while(u != n){
            if (u < n){
                System.out.println("higher");
            } else if (u > n){
                System.out.println("lower");
            }
            u = sc.nextInt();
        }
        System.out.println("You've Won! The number is: " + n);

    }
}
