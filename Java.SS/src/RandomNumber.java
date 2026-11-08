import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){
        Random ra = new Random();
        int number;
        number = ra.nextInt();
        System.out.println(number);
    }
}
